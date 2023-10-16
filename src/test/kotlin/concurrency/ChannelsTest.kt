package concurrency

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class ChannelsTest {
    private val channels = Channels()

    /**
     * A default channel instance waits a value is consumed and then send a new value.
     * It prints the following:
     * ```bash
     * 1 Aptenodytes
     * Sending genus: 1 Aptenodytes
     * 2 Pygoscelis
     * Sending genus: 2 Pygoscelis
     * 3 Eudyptula
     * Sending genus: 3 Eudyptula
     * 4 Spheniscus
     * Sending genus: 4 Spheniscus
     * 5 Megadyptes
     * Sending genus: 5 Megadyptes
     * 6 Eudyptes
     * Sending genus: 6 Eudyptes
     * ```
     */
    @Test
    fun `given delay of 700, when emit, then send and collect`(): Unit = runBlocking {
        launch {
            channels.sendPenguinGenus()
        }
        delay(300)
        for (state in channels.state) {
            println(state)
            delay(700)
        }
    }

    /**
     * It prints the following:
     * ```bash
     * Sending genus: 1 Aptenodytes
     * Sending genus: 2 Pygoscelis
     * 1 Aptenodytes
     * Sending genus: 3 Eudyptula
     * Sending genus: 4 Spheniscus
     * Sending genus: 5 Megadyptes
     * Sending genus: 6 Eudyptes
     * 2 Pygoscelis
     * 3 Eudyptula
     * 4 Spheniscus
     * 5 Megadyptes
     * 6 Eudyptes
     * ```
     */
    @Test
    fun `given delay of 700 and using buffered, when emit, then send without waiting it collects`(): Unit = runBlocking {
        launch {
            channels.sendPenguinGenusBuffered()
        }
        delay(300)
        for (state in channels.stateBuffered) {
            println(state)
            delay(700)
        }
    }
}