package patterns.observer

class WeatherData : Subject {

    var observers :MutableList<Observer> = mutableListOf()
    var temperature :Float = 0f
    var humidity :Float = 0f
    var pressure :Float = 0f

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers){
            observer.update(temp = temperature, humidity = humidity, pressure = pressure)
        }
    }

    fun measurementsChanged(){
        notifyObservers()
    }



}