package classes

/**
 * Unit Test for this class is -> DataClassTest.kt
 */
class Cloud(level: String, physicalForm: String, variety: String)

data class DataCloud(val level: String, val physicalForm: String, val variety: String) {
    var anotherParamOutsideConstructor: String = ""
}
