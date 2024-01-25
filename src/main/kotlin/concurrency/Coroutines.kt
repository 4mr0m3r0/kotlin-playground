package concurrency

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

private var zeroTime = System.currentTimeMillis()
private fun log(message: Any?) = println("${System.currentTimeMillis() - zeroTime} " + "[${Thread.currentThread().name}] $message")

fun callingANewJavaThread() {
    println("I'm on ${Thread.currentThread().name}")
    thread {
        println("And I'm on ${Thread.currentThread().name}")
    }
}

fun startingNewCoroutines() = runBlocking {
    log("The first, parent, coroutine starts")
    launch {
        log("The second coroutine starts and is ready to be suspended")
        delay(100L)
        log("The second coroutine is resumed")
    }
    launch {
        log("The third coroutine can run in the meantime")
    }
    log("The first coroutine has launched two more coroutines")
}

fun calculateNumbers() = runBlocking {
    log("Starting the async computation")
    val myFirstDeferred = async { slowlyAddNumbers(2, 2) } // #1 Starts a new coroutine for each "async" call
    val mySecondDeferred = async { slowlyAddNumbers(4, 4) } // #1 Starts a new coroutine for each "async" call
    log("Waiting for the deferred value to be available")
    log("The first result: ${myFirstDeferred.await()}") // #2 Waits for the results to be available
    log("The second result: ${mySecondDeferred.await()}")// #2 Waits for the results to be available
}

private suspend fun slowlyAddNumbers(a: Int, b: Int): Int {
    log("Waiting a bit before calculating $a + $b")
    delay(a * 100L)
    return a + b
}

private fun launchInDefaultDispatcher() = runBlocking {
    log("Doing some work")
    launch(Dispatchers.Default) {
        log("Doing some background work")
    }
}

private fun switchingDispatchers() = runBlocking {
    launch(Dispatchers.Default) {
        log("Waiting before switching dispatcher")
        delay(200)
        withContext(Dispatchers.Main) {
            log("Doing some work in UI logic")
        }
    }
}

private fun counterStrictlySequentially() = runBlocking {
    launch(Dispatchers.Default) {
        var x = 0
        repeat(10_000) { x++ }
        println(x)
    }
}

private fun counterMultipleCoroutines() = runBlocking {
    var x = 0
    repeat(10_000) {
        launch(Dispatchers.Default) { x++ }
    }
    delay(1000)
    println(x)
}

private fun counterMutex() = runBlocking {
    val mutex = Mutex()
    var x = 0
    repeat(10_000) {
        launch(Dispatchers.Default) {
            mutex.withLock { x++ }
        }
    }
    delay(1000)
    println(x)
}

private fun counterMultipleCoroutinesAndAtomic() = runBlocking {
    val x = AtomicInteger(0) // another atomic data structure ConcurrentHashMap
    repeat(10_000) {
        launch(Dispatchers.Default) { x.incrementAndGet() }
    }
    delay(1000)
    println(x)
}

private fun counterSynchronized() = runBlocking {
    var x = 0
    repeat(10_000) {
        launch(Dispatchers.Default) {
            synchronized(this@runBlocking) { x++ }
        }
    }
    delay(1000)
    println(x)
}

private fun introspect() = runBlocking {
    log(coroutineContext)
}

private fun coolroutine() = runBlocking(Dispatchers.IO + CoroutineName("Coolroutine")) {
    log(coroutineContext)
}

private fun coroutineWithException() = runBlocking {
    launch(Dispatchers.IO) {
        try {
            delay(2000)
            error("Testing Exceptions")
        } catch (e: Exception) {
            println("Exception is ${e.message}")
        }
    }
}

fun main() {
    coroutineWithException()
}