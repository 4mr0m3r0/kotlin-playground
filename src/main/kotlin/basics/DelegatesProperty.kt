package basics

import kotlin.properties.Delegates

class DelegatesProperty {
    /**
     * With a Lazy property, the variable `database` is not going to initialize itself until `saveInDb()` method is called.
     * This is very useful when we want to save time initializing `DelegatesProperty` class. Otherwise,
     * not using `lazy`, i.e. `val database = Database()`, `DelegatesProperty` instance will not initialize until
     * `Database` finish to initialize.
     */
    val database by lazy { Database() }

    /**
     * Delegates with Observable
     */
    var x: Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("oldValue: $oldValue, newValue: $newValue")
    }

    /**
     * Delegates with vetoable.
     * It allows us to ban a value before it is actually changed, i.e., we decide if a new value is stored or not.
     * It returns a boolean.
     */
    var positiveInt: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue >= 0
    }

    /**
     * Late initialization
     */
    var lateInitialization: String by Delegates.notNull()
    // OR
    /**
     * When using lateinit keyword we can check if it is actually initialized or not.
     * It is not possible to use lateinit with Int, Double, Float, i.e.: basic types.
     */
    lateinit var lateInit: String
    fun checkLateInitialization() {
        if (::lateInit.isInitialized) {
            println("Initialized")
        }
    }

    fun saveInDb() {
        database.save()
    }
}

class Database {
    fun save() {}
}