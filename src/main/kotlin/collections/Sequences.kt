package collections

class Sequences {
    val penguinGenus = sequenceOf(
        "Aptenodytes",
        "Pygoscelis",
        "Eudyptula",
        "Spheniscus",
        "Megadyptes",
        "Eudyptes",
    )

    fun generatingEvenSequence(): Sequence<Int> {
        val even = generateSequence(2) { it * 2 }
            .takeWhile { it < 5_000 }
        return even
    }

    fun sequencesOfAnything(): Sequence<Any> {
        val anything = sequence {
            yield("Penguins are a group of aquatic flightless birds -->")
            yieldAll(
                listOf(
                    "Aptenodytes",
                    "Pygoscelis",
                    "Eudyptula",
                    "Spheniscus",
                    "Megadyptes",
                    "Eudyptes",
                )
            )
            yieldAll(
                generateSequence(2) { it * 2 }
                    .takeWhile { it < 5_000 }
            )
        }
        return anything
    }
}
