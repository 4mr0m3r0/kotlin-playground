package classes

class Lion(
    generalCharacteristics: String,
    val prides: String,
    val hunting: String,
    val reproduction: String,
    val lifeCycle: String,
    val distribution: String,
) {
    var generalCharacteristics = generalCharacteristics
        get() = "The lion $field"
        set(value) {
            if (value != field) {
                field = value
            }
        }
}

class Leopard(
    generalCharacteristics: String,
    prides: String,
    hunting: String,
    reproduction: String,
    lifeCycle: String,
    distribution: String,
) {
    val generalCharacteristics: String
    val prides: String
    val hunting: String
    val reproduction: String
    val lifeCycle: String
    val distribution: String

    init {
        this.generalCharacteristics = generalCharacteristics
        this.prides = prides
        this.hunting = hunting
        this.reproduction = reproduction
        this.lifeCycle = lifeCycle
        this.distribution = distribution
    }
}