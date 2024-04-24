package patterns.decorator

class Soy(val beverage: Beverage) : CondimentDecorator() {

    override var description: String
        get() = "${beverage.description}, Soy"
        set(value) {}

    override fun cost(): Double {
        return .15 + beverage.cost()
    }
}