package designpattern.state.variantB

/**
 *******************************************************************
 ** See Agile Software Development book by Robert C. Martins,     **
 ** for a better understanding of this approach and more.         **
 *******************************************************************
 */
class TurnstileContext {
    private val lockedState: TurnstileState = LockedTurnstileState()
    private val unlockedState: TurnstileState = UnlockedTurnstileState()
    private var state = lockedState

    fun coin() {
        state.coin(this)
    }

    fun pass() {
        state.pass(this)
    }

    fun setLocked() {
        state = lockedState
    }

    fun setUnlocked() {
        state = unlockedState
    }

    fun grazie() {
        println("Grazie...")
    }

    fun alarm() {
        println("Activating alarm...")
    }

    fun lock() {
        println("Locking turnstile...")
    }

    fun unlock() {
        println("Unlocking turnstile...")
    }
}