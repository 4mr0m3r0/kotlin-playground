package functions

class OperatorOverloading {
    data class Cat(val name: String)
    val cheetah = Cat(name = "Cheetah")
    val lion = Cat(name = "Lion")
    val tiger = Cat(name = "Tiger")
    val jaguar = Cat(name = "Jaguar")

    fun getCats(): String {
        return (cheetah + lion + tiger + jaguar).name
    }

    operator fun Cat.plus(other: Cat): Cat = copy(name = "$name ${other.name}")
}