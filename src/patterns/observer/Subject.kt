package patterns.observer

interface Subject {

    fun registerObserver(observer: Observer): Unit {

    }

    fun removeObserver(observer: Observer): Unit {

    }

    fun notifyObservers(): Unit {

    }

}