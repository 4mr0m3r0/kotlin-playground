package designpattern.mediator

class EntryField(dialog: DialogMediator) : WidgetColleague(dialog = dialog) {
    fun setText(text: String) { }

    override fun handleMouse(event: MouseEvent) { }
}