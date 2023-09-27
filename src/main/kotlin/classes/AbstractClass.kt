package classes

/**
 * A class may be declared `abstract`, along with some or all of its members.
 * An abstract member does not have an implementation in its class.
 * You don't need to annotate abstract classes or functions with `open`.
 */
abstract class EukaryoticCell()

class AnimalCell : EukaryoticCell()
class PlantCell : EukaryoticCell()
class FungiCell : EukaryoticCell()
class Protist : EukaryoticCell()
