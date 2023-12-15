package concurrency

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.random.Random

private var zeroTime = System.currentTimeMillis()
private fun log(message: Any?) = println("${System.currentTimeMillis() - zeroTime} " + "[${Thread.currentThread().name}] $message")

private fun startingANumberOfDifferentCoroutines() = runBlocking {
    launch {
        delay(1000)
        launch {
            delay(250)
            log("Grandchild done")
        }
        log("Child 1 done!")
    }
    launch {
        delay(500)
        log("Child 2 done!")
    }
    log("Parent done!")
}

private suspend fun generateNumber(): Int {
    delay(500)
    return Random.nextInt(0, 10)
}

private suspend fun computeSum() {
    log("Computing a sum...")
    val sum = coroutineScope {
        val a = async { generateNumber() }
        val b = async { generateNumber() }
        a.await() + b.await()
    }
    log("Sum is $sum")
}

private fun globalScope() = runBlocking {
    GlobalScope.launch {
        delay(1000)
        launch {
            delay(250)
            log("Grandchild done")
        }
        log("Child 1 done!")
    }
    GlobalScope.launch {
        delay(500)
        log("Child 2 done!")
    }
    log("Parent done!")
}

private fun contextInStructuredConcurrency() = runBlocking(Dispatchers.Default) {
    log(coroutineContext)
    launch {
        log(coroutineContext)
        launch(Dispatchers.IO + CoroutineName("mine")) {
            log(coroutineContext)
        }
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
private fun childrenAndParent() = runBlocking(CoroutineName("A")) {
    log("A's job: ${coroutineContext.job}")
    launch(CoroutineName("B")) {
        log("B's job: ${coroutineContext.job}")
        log("B's parent: ${coroutineContext.job.parent}")
    }
    log("A's children: ${coroutineContext.job.children.toList()}")
}

@OptIn(ExperimentalCoroutinesApi::class)
private fun parenChildCoroutineScope() = runBlocking<Unit> {
    log("A's job: ${coroutineContext.job}")
    coroutineScope {
        log("B's parent: ${coroutineContext.job.parent}")
        log("B's job: ${coroutineContext.job}")
        launch {
            log("C's parent: ${coroutineContext.job.parent}")
        }
    }
}

private fun triggeringCancellation() = runBlocking {
    val launchedJob = launch {
        log("I'm launched!")
        delay(1000)
        log("I'm done!")
    }
    val asyncDeferred = async {
        log("I'm async")
        delay(1000)
        log("I'm done!")
    }
    delay(200)
    launchedJob.cancel()
    asyncDeferred.cancel()
}

private suspend fun calculate(): Int {
    delay(3000)
    return 2 + 2
}
private fun cancellationAutomatically() = runBlocking {
    val quickResult = withTimeoutOrNull(500) {
        calculate()
    }
    println(quickResult)
    val slowResult = withTimeoutOrNull(5000) {
        calculate()
    }
    println(slowResult)
}

private fun cancellationCascade() = runBlocking {
    val job = launch {
        launch {
            launch {
                launch {
                    log("I'm started")
                    delay(500)
                    log("I'm done!")
                }
            }
        }
    }
    delay(200)
    job.cancel()
}

private suspend fun doWork() {
    delay(500)
    throw UnsupportedOperationException()
}
private fun swallowingException() = runBlocking {
    withTimeout(2000) {
        while (true) {
            try {
                doWork()
            } catch (e: Exception) {
                println("Oops: ${e.message}")
            }
        }
    }
}

private suspend fun doCpuHeavyWork(): Int {
    log("I'm doing work!")
    var counter = 0
    val startTime = System.currentTimeMillis()
    while (System.currentTimeMillis() < startTime + 500) {
        counter++
    }
    return counter
}
private fun cooperativeCancellation() = runBlocking {
    val myJob = launch {
        repeat(5) {
            doCpuHeavyWork()
        }
    }
    delay(600)
    myJob.cancel()
}

fun main() {
    cooperativeCancellation()
}