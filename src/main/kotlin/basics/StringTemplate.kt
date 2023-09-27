package basics

import kotlin.random.Random

val random = Random(1000).nextInt()

val stringTemplate = "Random number of $random"