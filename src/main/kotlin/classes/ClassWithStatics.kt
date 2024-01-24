package classes

/**
 * See Unit Test for this class for scenarios
 */
class ClassWithStatics(private val attribute: String) {
    init {
        numberOfInstances++
    }

    companion object {
        var numberOfInstances: Int = 0
            private set
    }
}