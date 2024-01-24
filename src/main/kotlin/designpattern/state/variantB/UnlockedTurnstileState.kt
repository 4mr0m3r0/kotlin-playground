package designpattern.state.variantB

/**
 *******************************************************************
 ** See Agile Software Development book by Robert C. Martins,     **
 ** for a better understanding of this approach and more.         **
 *******************************************************************
 */
class UnlockedTurnstileState : TurnstileState {
    override fun coin(t: TurnstileContext) {
        t.grazie()
    }

    override fun pass(t: TurnstileContext) {
        t.setLocked()
        t.lock()
    }
}