package patterns.strategy

//  The Strategy Pattern defines a family of algorithms,
//encapsulates each one, and makes them interchangeable.
//Strategy lets the algorithm vary independently of
//clients that use it.

fun main() {
    val mallardDuck = MallardDuck()
    mallardDuck.performFly()
    mallardDuck.performQuack()
    val modelDuck = ModelDuck()
    modelDuck.performFly()
    modelDuck.flyBehavior = FlyRocketPowered()
    modelDuck.performFly()
}