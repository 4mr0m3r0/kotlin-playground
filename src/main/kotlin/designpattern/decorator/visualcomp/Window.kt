package designpattern.decorator.visualcomp

class Window {
    fun setContents(contents: VisualComponent) {
        contents.draw()
    }
}