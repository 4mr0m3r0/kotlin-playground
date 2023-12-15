package concurrency

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CoroutineBuildersAndJobs {
    /**
     * runBlocking: Blocks the thread until the code inside is finished.
     */
    suspend fun builderRunBlocking(): String {
        return runBlocking {
            val a = blockingFunctionA()
            val b = blockingFunctionB()
            val c = blockingFunctionC()
            "first result $a, second result $b, third result $c"
        }
    }

    /**
     * launch: It does not block the main thread. It is the basic builder that returns a Job. It needs a scope.
     */
    @OptIn(DelicateCoroutinesApi::class)
    suspend fun builderLaunch() {
        val job = GlobalScope.launch(Dispatchers.Main) {
            val a = blockingFunctionA()
            val b = blockingFunctionB()
            val c = blockingFunctionC()
            println("first result $a, second result $b, third result $c")
        }

        job.join() // The join() function waits a previous coroutines to finish before to continue.
        job.cancel() // The cancel() function cancel all coroutines associated to the job. This way its code stop running.
    }

    /**
     * async: It should be called from another builder, i.e.: launch.
     * With async the code inside runs and only when calling await() function the code outside will be suspended waiting for the result.
     */
    suspend fun builderAsync() {
        val job = GlobalScope.launch(Dispatchers.Main) {
            val a = blockingFunctionA()
            val b = async { blockingFunctionB() }
            val c = async { blockingFunctionC() }
            println("first result $a, second result ${b.await()}, third result ${c.await()}")
        }
    }

    private fun blockingFunctionA(): String {
        Thread.sleep(2000)
        return "A"
    }

    private fun blockingFunctionB(): String {
        Thread.sleep(2000)
        return "B"
    }

    private fun blockingFunctionC(): String {
        Thread.sleep(2000)
        return "C"
    }
}