package designpattern.decorator.visualcomp

fun main() {
    val window = Window()
    val textView = TextView()

    window.setContents(
        contents = BorderDecorator(
            component = ScrollDecorator(textView),
            borderWidth = 1
        )
    )
}