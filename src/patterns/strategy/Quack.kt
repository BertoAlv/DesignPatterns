package patterns.strategy

class Quack : QuackBehavior {

    override fun quack() {
        println("Quack")
    }

}