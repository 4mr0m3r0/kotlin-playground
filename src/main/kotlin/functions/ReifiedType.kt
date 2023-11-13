package functions

class ReifiedType {
    private val soupOfTypes = listOf(2, "AnyString", 2.0f, 45000L, "AnotherString", 30.0, 10)

    fun filteringByInstance() {
        val onlyInt = soupOfTypes.filterIsInstance<Int>()
        val onlyString = soupOfTypes.filterIsInstance<String>()
        val onlyLong = soupOfTypes.filterIsInstance2<Long>()
        val onlyFloat = soupOfTypes.filterIsInstance2<Float>()
    }

    private inline fun <reified T> List<Any>.filterIsInstance2(): List<T> {
        val newList = mutableListOf<T>()
        for (item in this) {
            if (item is T) {
                newList.add(item)
            }
        }
        return newList
    }
}