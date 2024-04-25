package patterns.factory

class NYStylePepperoniPizza : Pizza(
    name = "New York Style Pepperoni Pizza",
    dough = "Thin Crust",
    sauce = "BBQ"
) {

    init {
        toppings.add("Pineapple")
    }
}