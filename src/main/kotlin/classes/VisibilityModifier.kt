package classes

class PublicClass //By default, is public always

internal class InternalClass //This class is accessible only inside a module or a Gradle module.

private class PrivateClass //This class is accessible only inside this file (VisibilityModifier.kt)

open class ParentClass {
    protected fun anyMethodToBeExtended() { } //Protected to be used only for children classes who extend from `ParentClass`.
}

class ChildClass : ParentClass() {
    private fun usingParentMethod() {
        anyMethodToBeExtended()
    }
}

class NoChildClass {
    val parentClass = ParentClass() //To create an instance is allowed here.
                                    // But it is not when constructor is protected. See below.
}

open class ProtectedConstructor protected constructor() //Protected constructor allows that other children classes extend.
                                                        //But it does not allow that any class creates an instance of it.

class ExtendFromProtectedConstructor : ProtectedConstructor()

class AnyClass {
//    val protectedConstructor = ProtectedConstructor() //This will rise an error, because of the reasons previously explained.
}