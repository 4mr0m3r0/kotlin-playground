package functions

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@OptIn(ExperimentalContracts::class)
class Contracts {

    fun printOnlyViewGroup(view: View) {
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

    fun printOnlyAbsSeekBar(view: View) {
        requireChildren(view)
        println(view.thumbTintMode)
    }
    private fun requireChildren(view: View) {
        contract {
            returns() implies (view is AbsSeekBar)
        }
        if (view !is AbsSeekBar) throw IllegalArgumentException()
    }

    data class Person(val name: String, val age: Int)
    fun firstLetter(person: Person): Char {
        val firstLetter: Char
        person.name.let { firstLetter = it[0] }
        return firstLetter
    }
}

open class View
class ViewGroup : View() {
    val childCount = 3
}
class AbsSeekBar : View() {
    val thumbTintMode = "Mode"
}