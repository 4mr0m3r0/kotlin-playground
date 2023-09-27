package classes

import kotlin.random.Random

class SeveralConstructors {
    constructor(paramA: String)

    constructor(paramB: Int)
}

private val severalString = SeveralConstructors(paramA = "AnyString")

private val severalInt = SeveralConstructors(paramB = Random(100).nextInt())