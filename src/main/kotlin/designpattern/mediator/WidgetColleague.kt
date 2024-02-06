package designpattern.mediator

abstract class WidgetColleague(private val dialog: DialogMediator) {
    open fun changed() {
        dialog.widgetChanged(this)
    }
    abstract fun handleMouse(event: MouseEvent)
}