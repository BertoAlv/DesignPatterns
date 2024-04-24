package patterns.decorator

class Decaf(override var description: String = "Decaf") : Beverage() {

    override fun cost(): Double {
        return 1.05
    }

}