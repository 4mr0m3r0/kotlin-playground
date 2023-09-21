import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun coroutineLaunch() = runBlocking {
    launch {
        for (i in 0..10) {
            delay(100)
            print("$i, ")
        }
    }
}