package concurrency

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.time.Duration.Companion.milliseconds

class SharedFlows {
    private val penguinGenus = listOf(
        "1 Aptenodytes",
        "2 Pygoscelis",
        "3 Eudyptula",
        "4 Spheniscus",
        "5 Megadyptes",
        "6 Eudyptes",
    )

    /**
     * See Unit Test function for how 1st and 2nd element are lost because there is no usage of replay param.
     */
    private val _state = MutableSharedFlow<String>()
    val state = _state.asSharedFlow()
    suspend fun emitPenguinGenus() {
        for (genus in penguinGenus) {
            delay(100)
            _state.emit(genus)
        }
    }

    /**
     * Replay param stores the number of values replayed to new subscribers.
     * In this example it will store first two elements of the list.
     * See the Unit Test function to see how first and second element are not lost.
     */
    private val _stateReplay = MutableSharedFlow<String>(replay = 2)
    val stateReplay = _stateReplay.asSharedFlow()
    suspend fun emitPenguinGenusReplay() {
        for (genus in penguinGenus) {
            delay(100)
            _stateReplay.emit(genus)
            println("Emitting genus: $genus")
        }
    }

    /**
     * ExtraBufferCapacity the number of values buffered in addition to replay. emit does not suspend
     * while there is a buffer space remaining
     */
    private val _stateExtraBufferCapacity = MutableSharedFlow<String>(replay = 2, extraBufferCapacity = 1)
    val stateExtraBufferCapacity = _stateExtraBufferCapacity.asSharedFlow()
    suspend fun emitPenguinGenusExtraBufferCapacity() {
        for (genus in penguinGenus) {
            delay(100)
            _stateExtraBufferCapacity.emit(genus)
            println("Emitting genus: $genus")
        }
    }

    /**
     * OnBufferOverflow: Buffer overflow can happen only when there is at least one subscriber
     * that is not ready to accept the new value. In the absence of subscribers only the
     * most recent replay values are stored and the buffer overflow behavior is never
     * triggered and has no effect.
     */
    private val _stateOnBufferOverflow = MutableSharedFlow<String>(
        replay = 2,
        extraBufferCapacity = 1,
        onBufferOverflow = BufferOverflow.DROP_OLDEST
    )
    val stateOnBufferOverflow = _stateOnBufferOverflow.asSharedFlow()
    suspend fun emitPenguinGenusOnBufferOverflow() {
        for (genus in penguinGenus) {
            delay(100)
            _stateOnBufferOverflow.emit(genus)
            println("Emitting genus: $genus")
        }
    }

    private val _messageFlow = MutableSharedFlow<Int>()
    val messageFlow = _messageFlow.asSharedFlow()

    fun beginBroadcasting(scope: CoroutineScope) {
        scope.launch {
            while(true) {
                delay(500.milliseconds)
                val number = Random.nextInt(0..10)
                log("Emitting $number!")
                _messageFlow.emit(number)
            }
        }
    }
}