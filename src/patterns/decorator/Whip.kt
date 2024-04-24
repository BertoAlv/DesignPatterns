package patterns.decorator

class Whip(val beverage: Beverage) : CondimentDecorator() {

    override var description: String
        get() = "${beverage.description}, Whip"
        set(value) {}

    override fun cost(): Double {
        return .10 + beverage.cost()
    }
}