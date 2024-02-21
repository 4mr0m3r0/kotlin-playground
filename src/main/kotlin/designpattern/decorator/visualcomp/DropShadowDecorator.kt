package designpattern.decorator.visualcomp

class DropShadowDecorator(component: VisualComponent) : Decorator(component = component) {
    override fun draw() {
        super.draw()
        addShadow()
    }

    private fun addShadow() {
        println("add shadow")
    }
}