package functions

class LocalFunction {

    fun regularFunction() {
        val x = 20

        /**
         * In order to access previous variable declaration, the local function should be below them.
         */
        fun local(arg: Int) = x + arg

        /**
         * The variable must be below of the local function which it is calling.
         */
        val b = local(3)
        val c = local(4)
    }
}