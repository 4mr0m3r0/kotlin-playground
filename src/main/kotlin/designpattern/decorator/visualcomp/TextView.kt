package designpattern.decorator.visualcomp

class TextView : VisualComponent {
    override fun draw() {
        println("drawing TextView")
    }

    override fun resize() {
        println("resizing TextView")
    }
}