package strategypattern

abstract class Duck() {

    lateinit var flyBehavior : FlyBehavior
    lateinit var quackBehavior : QuackBehavior

    abstract fun display()

    fun performFly(){
        flyBehavior.fly()
    }

    fun performQuack(){
        quackBehavior.quack()
    }

    fun swim(){
        println("All ducks float, even decoys!")
    }

}