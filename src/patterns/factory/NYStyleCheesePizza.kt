package patterns.factory

class NYStyleCheesePizza : Pizza(
    name = "NY Style Cheese Pizza",
    dough = "Thin Crust",
    sauce = "Marinara"
) {

    init {
        toppings.add("Grated Reggiano Cheese")
        toppings.add("Pulled Pork")
    }


}