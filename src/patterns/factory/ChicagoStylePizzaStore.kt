package patterns.factory

class ChicagoStylePizzaStore : PizzaStore() {

    override fun createPizza(type: String): Pizza? {
        if (type.equals("cheese")){
            return ChicagoStyleCheesePizza()
        }
        else if (type.equals("pepperoni")){
            return ChicagoStylePepperoniPizza()
        }
        else return null
    }


}