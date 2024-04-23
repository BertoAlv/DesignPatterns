package patterns.strategy

class ModelDuck() : Duck() {

    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }

    override fun display() {
        println("I'm a model duck")
    }

}