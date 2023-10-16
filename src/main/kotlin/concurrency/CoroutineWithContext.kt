package concurrency

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CoroutineWithContext {
    suspend fun withContextDefault(): String = withContext(Dispatchers.Default) {
        "Used by all standard builders if no dispatcher is specified"
    }

    suspend fun withContextMain(): String = withContext(Dispatchers.Main) {
        "Main thread of UI applications"
    }

    suspend fun withContextIO(): String = withContext(Dispatchers.IO) {
        "Designed for offloading of IO-intensive blocking operations (like file I/O and blocking socket I/O)"
    }

    suspend fun withContextUnconfined(): String = withContext(Dispatchers.Unconfined) {
        "Unconfined dispatcher should not normally be used in code"
    }
}