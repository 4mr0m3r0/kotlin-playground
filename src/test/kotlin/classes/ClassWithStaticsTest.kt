package classes

import kotlin.test.Test

class ClassWithStaticsTest {

    @Test
    fun `count number of instances`() {
        println(ClassWithStatics.numberOfInstances)
        val a = ClassWithStatics("A")
        println(a)
        println(ClassWithStatics.numberOfInstances)
        val b = ClassWithStatics("B")
        println(b)
        println(ClassWithStatics.numberOfInstances)
        val c = ClassWithStatics("C")
        println(c)
        println(ClassWithStatics.numberOfInstances)
    }
}