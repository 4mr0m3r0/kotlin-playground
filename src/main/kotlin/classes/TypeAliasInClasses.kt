package classes

/**
 * One of the interesting features of typealias is that its declaration can be used anywhere in any other class,
 * conversely of import alias that can be only used inside the same class it is declared.
 */
typealias DataParamA = classes.typealiaspcka.TypeAliasRepeatedClass
typealias DataParamB = classes.typealiaspckb.TypeAliasRepeatedClass

fun usingDataClassWithTypeAlias() {
    val paramA = DataParamA(paramA = "A")
    val paramB = DataParamB(paramB = "B")
}

