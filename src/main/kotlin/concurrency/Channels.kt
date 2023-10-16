package concurrency

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay

class Channels {
    private val penguinGenus = listOf(
        "1 Aptenodytes",
        "2 Pygoscelis",
        "3 Eudyptula",
        "4 Spheniscus",
        "5 Megadyptes",
        "6 Eudyptes",
    )

    /**
     * A default channel instance waits a value is consumed, and then it sends a new value.
     *
     * See Unit Test for how to read Channels.
     */
    private val _state = Channel<String>()
//    val state = _state.receiveAsFlow() //Converting Channel to Flow
    val state = _state
    suspend fun sendPenguinGenus() {
        for (genus in penguinGenus) {
            delay(100)
            _state.send(genus)
            println("Sending genus: $genus")
        }
        _state.close() //Close the channel once all element where sent.
    }

    /**
     * A channel with capacity Buffered send values without waiting to be collected.
     * Capacity param accepts a custom number
     * ```kotlin
     * Channel<String>(capacity = 5)
     * ```
     * See Unit Test for how to read Channels.
     */
    private val _stateBuffered = Channel<String>(capacity = Channel.BUFFERED)
    val stateBuffered = _stateBuffered
    suspend fun sendPenguinGenusBuffered() {
        for (genus in penguinGenus) {
            delay(100)
            _stateBuffered.send(genus)
            println("Sending genus: $genus")
        }
        _stateBuffered.close() //Close the channel once all element where sent.
    }
}