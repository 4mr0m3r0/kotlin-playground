package designpattern.state

import designpattern.state.variantA.TCPConnectionContext
import designpattern.state.variantB.TurnstileContext

fun main() {
    println("Variant A")
    val connection = TCPConnectionContext()
    connection.activeOpen()
    connection.passiveOpen()
    connection.close()
    connection.acknowledge()
    connection.synchronize()
    println("------------------------------------------------------")
    println("Variant B")
    val turnstile = TurnstileContext()
    turnstile.coin()
    turnstile.pass()
}