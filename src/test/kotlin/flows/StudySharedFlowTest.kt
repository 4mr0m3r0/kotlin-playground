package flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.test.Test

class StudySharedFlowTest {
    private val studySharedFlow = StudySharedFlow()

    @Test
    fun `given delay of 700, when emit, then losing 1st and 2nd element`() = runBlocking<Unit> {
        launch {
            studySharedFlow.emitPenguinGenus()
        }
        delay(700)
        withTimeoutOrNull<Unit>(3000) {
            studySharedFlow.state.collect(::println)
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
            studySharedFlow.emitPenguinGenusReplay()
        }
        delay(300)
        withTimeoutOrNull<Unit>(5000) {
            studySharedFlow.stateReplay.collect {
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
            studySharedFlow.emitPenguinGenusExtraBufferCapacity()
        }
        delay(300)
        withTimeoutOrNull<Unit>(5000) {
            studySharedFlow.stateExtraBufferCapacity.collect {
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
            studySharedFlow.emitPenguinGenusOnBufferOverflow()
        }
        delay(300)
        withTimeoutOrNull<Unit>(5000) {
            studySharedFlow.stateOnBufferOverflow.collect {
                println(it)
                delay(700)
            }
        }
    }
}