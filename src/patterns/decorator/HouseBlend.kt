package patterns.decorator

class HouseBlend(override var description: String = "House Blend Coffee") : Beverage() {


    override fun cost(): Double {
        return .89
    }


}