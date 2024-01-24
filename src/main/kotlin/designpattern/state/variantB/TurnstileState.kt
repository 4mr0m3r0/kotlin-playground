package designpattern.state.variantB

/**
 *******************************************************************
 ** See Agile Software Development book by Robert C. Martins,     **
 ** for a better understanding of this approach and more.         **
 *******************************************************************
 */
interface TurnstileState {
    fun coin(t: TurnstileContext)
    fun pass(t: TurnstileContext)
}