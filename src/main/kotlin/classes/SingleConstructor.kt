package classes

import kotlin.random.Random

class SingleConstructor(paramA: String, paramB: Int)

val single = SingleConstructor(paramA = "AnyString", paramB = Random(100).nextInt())