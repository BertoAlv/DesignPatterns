package patterns.decorator

class DarkRoast(override var description: String = "Dark Roast") : Beverage() {

    override fun cost(): Double {
        return .99
    }

}