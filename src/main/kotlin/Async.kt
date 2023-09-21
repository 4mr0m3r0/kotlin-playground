import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun coroutineAsync() = runBlocking {
    repeat(10) {
        val deferred: Deferred<Int> = async {
            getRandomNumber()
        }
        print("${deferred.await()}, ")
    }
}

private suspend fun getRandomNumber(): Int {
    delay(150)
    return Random.nextInt()
}