package patterns.decorator

class Espresso : Beverage() {

    override var description = "Espresso"

    override fun cost(): Double {
        return 1.99
    }

}