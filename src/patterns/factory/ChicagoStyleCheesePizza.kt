package patterns.factory

class ChicagoStyleCheesePizza : Pizza(
    name = "Chicago Style Deep Dish Cheese Pizza",
    dough = "Extra Thick Crust",
    sauce = "Plum Tomato"
) {

    init {
        toppings.add("Shredded Mozzarella Cheese")
    }

    override fun cut() {
        println("Cutting the pizza into square slices.")
    }

}