package designpattern.mediator

class Button(dialog: DialogMediator) : WidgetColleague(dialog = dialog) {
    fun setText(text: String) { }

    override fun handleMouse(event: MouseEvent) {
        changed()
    }
}