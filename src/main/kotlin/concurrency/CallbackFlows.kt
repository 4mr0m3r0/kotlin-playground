package concurrency

import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

class CallbackFlows {
    private val penguinGenus = listOf(
        "1 Aptenodytes",
        "2 Pygoscelis",
        "3 Eudyptula",
        "4 Spheniscus",
        "5 Megadyptes",
        "6 Eudyptes",
    )

    /**
     * Callback Flows
     *
     * See Unit Test for how to read Channels.
     */
    fun getPenguinGenus(callback: (String) -> Unit) {
        for (genus in penguinGenus) {
            Thread.sleep(100)
            callback(genus)
            println("Returning genus: $genus")
        }
    }

    fun CallbackFlows.updatesFlow(): Flow<String> = callbackFlow {
        getPenguinGenus { trySend(it) }
        awaitClose()
    }
}

