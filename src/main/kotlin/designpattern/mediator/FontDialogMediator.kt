package designpattern.mediator

class FontDialogMediator : DialogMediator() {
    private var ok: Button? = null
    private var cancel: Button? = null
    private var fontList: ListBox? = null
    private var fontName: EntryField? = null

    override fun showDialog() { }

    override fun widgetChanged(widget: WidgetColleague) {
        when (widget) {
            fontList -> fontName?.setText(text = fontList?.getSelection().orEmpty())
            ok -> println("OK button: Apply font change and dismiss dialog")
            cancel -> println("Cancel button: Dismiss dialog")
        }
    }

    override fun createWidget() {
        ok = Button(this)
        cancel = Button(this)
        fontList = ListBox(this)
        fontName = EntryField(this)
    }
}