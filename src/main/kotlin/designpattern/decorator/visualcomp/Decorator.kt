package designpattern.decorator.visualcomp

open class Decorator(private val component: VisualComponent) : VisualComponent {
    open override fun draw() {
        component.draw()
    }

    override fun resize() {
        component.resize()
    }
}