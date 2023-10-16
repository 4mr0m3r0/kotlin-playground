package concurrency

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class CoroutineScopes {
    private val coroutineScope = object : CoroutineScope {
        /**
         * When an operation inside the job fails, all the job is cancelled and all the operations inside are lost.
         * All the children jobs inside the parent job are cancelled too.
         */
        val job = Job()

        /**
         * With a supervisor job the above description is not going to occur.
         * Children of a supervisor job can fail independently of each other.
         *
         */
        val supervisorJob = SupervisorJob()

        override val coroutineContext: CoroutineContext
            get() = Dispatchers.Main + job

    }
    private val coroutineScopeB = MainScope()
    private val coroutineScopeC = CoroutineScope(Dispatchers.IO)

    suspend fun builderAsync() {
        coroutineScope.launch {
            val a = blockingFunctionA()
            val b = async { blockingFunctionB() }
            val c = async { blockingFunctionC() }
            println("first result $a, second result ${b.await()}, third result ${c.await()}")
        }
        coroutineScope.job.cancel()
        coroutineScopeB.coroutineContext.job.cancel()
        coroutineScopeC.coroutineContext.job.cancel()
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