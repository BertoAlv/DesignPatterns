package patterns.observer

class CurrentConditionsDisplay(val weatherData: Subject) : Observer, DisplayElement {

    var temperature :Float = 0f
    var humidity :Float = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity% humidity")
    }
}