package designpattern.decorator.visualcomp

class ScrollDecorator(component: VisualComponent) : Decorator(component = component) {
    override fun draw() {
        super.draw()
        addScroll()
    }

    private fun addScroll() {
        println("adding scroll")
    }
}