package patterns.factory

abstract class Pizza (
    val name: String,
    val dough: String,
    val sauce: String,
    val toppings: MutableList<String> = mutableListOf()
)
{

    fun prepare(){
        println("Preparing $name...")
        println("Tossing $dough dough...")
        println("Adding $sauce sauce...")
        print("Adding toppings:")
        for (topping in toppings){
            print(" $topping")
        }
    }

    open fun bake(){
        println("\nBake for 25 minutes at 350")
    }

    open fun cut(){
        println("Cutting the pizza into diagonal slices")
    }

    open fun box(){
        println("Place pizza in official PizzaStore box")
    }

}
