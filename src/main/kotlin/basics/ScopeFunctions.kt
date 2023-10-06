package basics

class ScopeFunctions {
    fun usingWith(): String {
        val builder = StringBuilder()
        return with(builder) {
            append("Hello")
            append(" ")
            append("World")
            toString()
        }
    }

    fun usingRun(): String {
        return StringBuilder().run {
            append("Hello")
            append(" ")
            append("World")
            toString()
        }
    }

    fun usingApply(): String {
        val stringBuilder = StringBuilder().apply {
            append("Hello")
            append(" ")
            append("World")
        }
        return stringBuilder.toString()
    }

    fun usingLet() {
        val str: String? = null
        str?.take(3)?.reversed()?.let {
           println(it)
        }
        str?.take(3)?.reversed()?.let(::println)
        str?.take(3)?.reversed()
            ?.let(::op)
            .also(::println)
    }

    fun op(str: String) {

    }
}