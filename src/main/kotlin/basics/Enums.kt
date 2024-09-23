package basics

enum class Panthera {
    SNOW_LEOPARD, LION, TIGER, LEOPARD, JAGUAR
}

val lion = Panthera.LION
val ordinalOfLion = lion.ordinal //1
val ordinalOfTiger = Panthera.TIGER.ordinal //2
val pantheras = Panthera.entries // iterating on each value

enum class PantheraSubspecies(vararg val subspecies: String) {
    SNOW_LEOPARD("Monotypic"),
    LION("Panthera leo leo", "Panthera leo melanochaita"),
    TIGER("Panthera tigris tigris", "Sunda Island tiger"),
    LEOPARD(
        "African leopard",
        "Indian leopard",
        "Javan leopard",
        "Arabian leopard",
        "Panthera pardus tulliana",
        "Amur leopard",
        "Indochinese leopard",
        "Sri Lankan leopard"
    ),
    JAGUAR("Monotypic")
}

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0);
    val rgb = (r * 256 + g) * 256 + b
    fun printColor() = println("$this is $rgb")
}

fun main() {
    println(Color.YELLOW.rgb)
    println(Color.ORANGE.printColor())
}
