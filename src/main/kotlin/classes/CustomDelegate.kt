package classes

import kotlin.reflect.KProperty

class Owner {
    var lazyPropertyA by CustomDelegate { "Whatever" }
    var lazyPropertyB by lazyB { "Whatever" }
}

fun <T> lazyB(producer: () -> T) = CustomDelegate(producer)

class CustomDelegate<T>(private val producer: () -> T) {
    private var lazyObject: T? = null

    operator fun getValue(owner: Any, property: KProperty<*>): T {
        if (lazyObject == null) {
            lazyObject = producer()
        }
        return lazyObject!! //this should be managed using `synchronized()` rather than `!!`
    }

    operator fun setValue(owner: Any, property: KProperty<*>, newAny: T) {
        lazyObject = newAny
    }
}