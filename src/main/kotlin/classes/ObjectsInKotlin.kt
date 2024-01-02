package classes

class ClassA {
    private fun privateFun() = "Any variable"

    companion object {
        fun companionFunA() {
            val classA = ClassA()
            classA.privateFun()
        }
    }
}

class ClassB {
    private fun privateFun() = "Any variable"

    companion object Access {
        fun companionFunB() {
            val classB = ClassB()
            classB.privateFun()
        }
    }
}

interface InterfaceC<T> {
    fun interfaceFun(): T
}

class ClassC {
    companion object : InterfaceC<String> {
        override fun interfaceFun(): String = "Interface C method"
    }
}

fun ClassB.Access.extendedFun() {
    println("Extending Object")
}

fun topLevelFunction() {
    val topLevelA = ClassA()
//    topLevelA.privateFun() //Cannot access to privateFun()
    val companionClassB = ClassB.Access
    companionClassB.extendedFun()
}