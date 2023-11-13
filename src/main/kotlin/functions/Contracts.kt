package functions

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@OptIn(ExperimentalContracts::class)
class Contracts {

    fun printOnlyInteger(view: View) {
        if (hasChildren(view)) {
            println(view.childCount)
        }
    }

    private fun hasChildren(view: View): Boolean {
        contract {
            returns(true) implies (view is ViewGroup)
        }
        return view is ViewGroup
    }
}

open class View
class ViewGroup : View() {
    val childCount = 3
}