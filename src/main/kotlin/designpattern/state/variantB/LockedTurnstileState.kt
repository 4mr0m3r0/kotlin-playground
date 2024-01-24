package designpattern.state.variantB

/**
 *******************************************************************
 ** See Agile Software Development book by Robert C. Martins,     **
 ** for a better understanding of this approach and more.         **
 *******************************************************************
 */
class LockedTurnstileState : TurnstileState {
    override fun coin(t: TurnstileContext) {
        t.setUnlocked()
        t.unlock()
    }

    override fun pass(t: TurnstileContext) {
        t.alarm()
    }
}
