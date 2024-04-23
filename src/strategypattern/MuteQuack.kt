package strategypattern

class MuteQuack : QuackBehavior {

    override fun quack() {
        println("<< Silence >>")
    }
}