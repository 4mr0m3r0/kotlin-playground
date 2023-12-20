package solid

/**
 * This is how a Liskov's principle is violated. When the derived Square class is changing the behavior of the methods
 * of Rectangle setHeight and setWidth.
 */
class LiskovViolationSquare(private val side: Double) : LiskovRectangle() {
    override var height: Double
        get() = super.height
        set(value) {
            super.height = value
            super.width = value // notice how the width of the parent is set inside the height of the derived class.
        }

    override var width: Double
        get() = super.width
        set(value) { height = value } // notice how the height of derived class is set inside width.
}

