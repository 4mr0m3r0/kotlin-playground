package designpattern.mediator

class ListBox(dialog: DialogMediator) : WidgetColleague(dialog = dialog) {
    fun setList(listItems: List<String>) { }

    override fun handleMouse(event: MouseEvent) { }

    fun getSelection(): String = "List Box Selection"
}