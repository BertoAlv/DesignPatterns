package patterns.observer

class ForecastDisplay (val weatherData: Subject) : Observer, DisplayElement {
    var currentPressure = 29.92f
    var lastPreassure = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        lastPreassure = currentPressure
        currentPressure = pressure

        display()
    }

    override fun display() {
        println("Forecast: ")
        if (currentPressure > lastPreassure){
            println("Improving weather on the way!")
        } else if (currentPressure == lastPreassure) {
            println("More of the same")
        } else if (currentPressure < lastPreassure) {
            println("Watch out for cooler, rainy weather")
        }
    }
}