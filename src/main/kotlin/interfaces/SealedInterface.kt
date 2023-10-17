package interfaces

class SealedInterface {
    fun flyBirds(canFly: CanFly): String = when(canFly) {
        is Accipitriformes -> TODO()
        is Anseriformes -> TODO()
        is Apodiformes -> TODO()
    }
}

sealed class BirdGenra(val shortDescription: String)

/**
 * When to use a Sealed Interface?:
 * For Composition.
 * They cannot store states.
 * When you need to create a sealed with properties --> then use sealed class.
 * When you need to create a sealed with no properties --> then much better with sealed interface.
 */
sealed interface CanFly

class Accipitriformes(val families: List<String>) : BirdGenra(
    shortDescription = "Eagles, Old World vultures, secretary-birds, hawks, harriers, etc."
), CanFly
class Anseriformes(val families: List<String>) : BirdGenra(shortDescription = "Waterfowl"), CanFly
class Apterygiformes(val families: List<String>) : BirdGenra(shortDescription = "kiwi")
class Apodiformes(val families: List<String>) : BirdGenra(shortDescription = "Cassowaries and emus"), CanFly
class Sphenisciformes(val family: String) : BirdGenra(shortDescription = "penguins")