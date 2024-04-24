package patterns.decorator

class Mocha(val beverage: Beverage) : CondimentDecorator() {

    override var description: String
        get() = "${beverage.description}, Mocha"
        set(value) {}

    override fun cost(): Double {
        return .20 + beverage.cost()
    }

}