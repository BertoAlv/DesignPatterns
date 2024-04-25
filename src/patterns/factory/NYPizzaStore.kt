package patterns.factory

class NYPizzaStore : PizzaStore() {

    override fun createPizza(type: String): Pizza? {
        if (type.equals("cheese")){
            return NYStyleCheesePizza()
        } else if (type.equals("pepperoni")) {
            return NYStylePepperoniPizza()
        }
        else return null
    }

}