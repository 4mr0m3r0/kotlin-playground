package classes

class DataObjects {
    sealed class Cat {
        /**
         * For `object Cheetah` see Unit Tests to see how `object` differs from `data object`
         */
        object Cheetah : Cat()
        data object Lion: Cat()
        data object Tiger: Cat()
        data object Jaguar: Cat()
    }
}