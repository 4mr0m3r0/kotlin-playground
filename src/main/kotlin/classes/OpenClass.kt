package classes

/**
 * By default, all classes in Kotlin are closed. They are final -- they can't be inherited.
 * Conversely, in Java all classes and methods are open for extension by default.
 * In order to extend a class in Kotlin, we have to add the `open` keyword before `class`.
 */
open class Animal(val mobility: String)
class Fish : Animal(mobility = "swim")
class Bird : Animal(mobility = "fly")
class Wolves : Animal(mobility = "run")
class Snail : Animal(mobility = "slide")

