package concurrency

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.test.Test

class SharedFlowsTest {
    private val sharedFlows = SharedFlows()

    @Test
    fun `given delay of 700, when emit, then losing 1st and 2nd element`() = runBlocking<Unit> {
        launch {
            sharedFlows.emitPenguinGenus()
        }
        delay(700)
        withTimeoutOrNull<Unit>(3000) {
            sharedFlows.state.collect(::println)
        }
    }

    /**
     * It prints the following:
     * ```bash
     * Emitting genus: 1 Aptenodytes
     * Emitting genus: 2 Pygoscelis
     * 1 Aptenodytes
     * Emitting genus: 3 Eudyptula
     * 2 Pygoscelis
     * Emitting genus: 4 Spheniscus
     * 3 Eudyptula
     * Emitting genus: 5 Megadyptes
     * 4 Spheniscus
     * Emitting genus: 6 Eudyptes
     * 5 Megadyptes
     * 6 Eudyptes
     * ```
     */
    @Test
    fun `given delay of 700 and using replay, when emit, then NOT losing 1st and 2nd element`(): Unit = runBlocking {
        launch {
            sharedFlows.emitPenguinGenusReplay()
        }
        delay(300)
        withTimeoutOrNull<Unit>(5000) {
            sharedFlows.stateReplay.collect {
                println(it)
                delay(700)
            }
        }
    }

    /**
     * It prints the following:
     * ```bash
     * Emitting genus: 1 Aptenodytes
     * Emitting genus: 2 Pygoscelis
     * 1 Aptenodytes
     * Emitting genus: 3 Eudyptula
     * Emitting genus: 4 Spheniscus
     * 2 Pygoscelis
     * Emitting genus: 5 Megadyptes
     * 3 Eudyptula
     * Emitting genus: 6 Eudyptes
     * 4 Spheniscus
     * 5 Megadyptes
     * 6 Eudyptes
     * ```
     */
    @Test
    fun `given delay 700-replay-extraBufferCapacity, when emit, then NOT losing 1st and 2nd element`(): Unit = runBlocking {
        launch {
            sharedFlows.emitPenguinGenusExtraBufferCapacity()
        }
        delay(300)
        withTimeoutOrNull<Unit>(5000) {
            sharedFlows.stateExtraBufferCapacity.collect {
                println(it)
                delay(700)
            }
        }
    }

    /**
     * It prints the following:
     * ```bash
     * Emitting genus: 1 Aptenodytes
     * Emitting genus: 2 Pygoscelis
     * 1 Aptenodytes
     * Emitting genus: 3 Eudyptula
     * Emitting genus: 4 Spheniscus
     * Emitting genus: 5 Megadyptes
     * Emitting genus: 6 Eudyptes
     * 4 Spheniscus
     * 5 Megadyptes
     * 6 Eudyptes
     * ```
     */
    @Test
    fun `given delay 700-replay-extraBufferCapacity-onBufferOverflow, when emit, then DROP 2nd and 3rd element`(): Unit = runBlocking {
        launch {
            sharedFlows.emitPenguinGenusOnBufferOverflow()
        }
        delay(300)
        withTimeoutOrNull<Unit>(5000) {
            sharedFlows.stateOnBufferOverflow.collect {
                println(it)
                delay(700)
            }
        }
    }
}