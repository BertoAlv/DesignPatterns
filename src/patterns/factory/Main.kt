package patterns.factory

//The Factory Method Pattern defines an interface
//for creating an object, but lets subclasses decide which
//class to instantiate.  Factory Method lets a class defer
//instantiation to subclasses.

fun main() {

    val nyPizzaStore : PizzaStore = NYPizzaStore()
    val chicagoPizzaStore : PizzaStore = ChicagoStylePizzaStore()

    var pizza: Pizza? = nyPizzaStore.orderPizza("cheese")
    println("Ethan ordered a ${pizza?.name}\n")

    pizza = chicagoPizzaStore.orderPizza("cheese")
    println("Joel ordered a ${pizza?.name}")

}