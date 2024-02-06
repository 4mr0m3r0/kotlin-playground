package designpattern.mediator

abstract class DialogMediator {
    abstract fun showDialog()
    abstract fun widgetChanged(widget: WidgetColleague)
    protected abstract fun createWidget()
}