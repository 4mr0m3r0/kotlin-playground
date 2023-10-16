package concurrency

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

class Flows {

    fun functionTransform(): Flow<String> {
        val numbers = flow {
            emit(1)
            delay(300)
            emit(2)
            delay(300)
            emit(3)
            delay(300)
            emit(4)
            delay(300)
            emit(5)
            delay(300)
            emit(6)
        }.transform {
            if (it % 2 == 0) emit("Even number $it")
        }
        return numbers
    }

    fun usingZip(): Flow<String> {
        // Because of `zip` the number 4 is not going to be emitted.
        val numbers = flowOf(1, 2, 3, 4)
        val letters = flowOf("a", "b", "c")

        return numbers.zip(letters) { number, letter ->
            "$number --> $letter"
        }
    }

    fun usingCombine(): Flow<String> {
        // Combine is going to emit the number '4' together with letter 'c' (repeating this letter).
        val numbers = flowOf(1, 2, 3, 4)
        val letters = flowOf("a", "b", "c")

        return numbers.combine(letters) { number, letter ->
            "$number --> $letter"
        }
    }

    fun usingCombineWithDelay(): Flow<String> {
        val numbers = flowOf(1, 2, 3, 4).onEach { delay(300) }
        val letters = flowOf("a", "b", "c").onEach { delay(500) }

        return numbers.combine(letters) { number, letter ->
            "$number --> $letter"
        }
    }
}