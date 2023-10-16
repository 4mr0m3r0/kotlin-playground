package concurrency

import kotlinx.coroutines.*
import kotlin.test.Test

class CallbackFlowsTest {
    private val callbackFlows = CallbackFlows()

    /**
     * A default channel instance waits a value is consumed and then send a new value.
     * It prints the following:
     * ```bash
     * Returning genus: 1 Aptenodytes
     * 1 Aptenodytes
     * Returning genus: 2 Pygoscelis
     * Returning genus: 3 Eudyptula
     * Returning genus: 4 Spheniscus
     * Returning genus: 5 Megadyptes
     * Returning genus: 6 Eudyptes
     * 2 Pygoscelis
     * 3 Eudyptula
     * 4 Spheniscus
     * 5 Megadyptes
     * 6 Eudyptes
     * ```
     */
    @Test
    fun `given delay of 700, when emit, then send and collect`(): Unit = runBlocking {
        delay(300)
        launch(Dispatchers.Default) {
            withTimeoutOrNull<Unit>(5000) {
                with(callbackFlows) {
                    updatesFlow().collect {
                        println(it)
                        delay(700)
                    }
                }
            }
        }
    }
}