package designpattern.decorator.visualcomp

class BorderDecorator(component: VisualComponent, private val borderWidth: Int) : Decorator(component = component) {
    override fun draw() {
        super.draw()
        drawBorder()
    }

    private fun drawBorder() {
        println("draw border $borderWidth")
    }
}