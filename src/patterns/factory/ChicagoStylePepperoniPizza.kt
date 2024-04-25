package patterns.factory

class ChicagoStylePepperoniPizza : Pizza(
    name = "Chicago Style Pepperoni Pizza",
    dough = "Thick Cheesy Crust",
    sauce = "Plum Tomato"
) {

    init {
        toppings.add("Caramel Onion")
    }
}