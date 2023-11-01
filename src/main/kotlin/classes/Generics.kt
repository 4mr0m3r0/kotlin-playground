package classes

private class GenericSupportingNulls<T> (private val element: T)
private fun genericNull() {
    val nullStr: String? = null
    val genericNull = GenericSupportingNulls(element = nullStr)
}

private class GenericExtendingAny<T : Any> (private val element: T)
private fun genericNotNull() {
    val str: String = ""
    val genericNotNull = GenericExtendingAny(str)
}

private interface CustomInterface {
    fun customMethod()
}
private class GenericExtendingInterface<T: CustomInterface> (private val element: T) {
    fun processingMethod() {
        element.customMethod()
    }
}
data class CustomData(val inputData: String) : CustomInterface {
    override fun customMethod() {
        println(inputData)
    }

}
fun genericExtendingInterface() {
    val data = CustomData(inputData = "input data")
    GenericExtendingInterface(element = data)
}

private class OutGeneric<out T>(private val element: T) {
    fun processingMethod() {
        println(element)
    }

    /**
     * Type parameter T is declared as 'out' but occurs in 'in' position in type T.
     * So, the code below will rise a compiler error.
     */
//    fun processingMethodParam(element: T) { }
}
fun outGeneric() {
    val intElement: OutGeneric<Int> = OutGeneric(30)
    val numberElement: OutGeneric<Number> = intElement
}

interface CustomComparable<in T> {
    fun compare(other: T): Int
}
fun inGeneric(comparable: CustomComparable<Number>) {
    val c: CustomComparable<Float> = comparable
    c.compare(other = 20f)
}
