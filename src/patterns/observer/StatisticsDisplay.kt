package patterns.observer

import kotlin.math.min

class StatisticsDisplay(val weatherData: Subject) : Observer, DisplayElement {

    var maxTemp: Float = 0f
    var minTemp: Float = 100f
    var tempSum: Float = 0f
    var numReadings: Int = 0


    init {
        weatherData.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        tempSum += temp
        numReadings ++

        if (temp > maxTemp){
            maxTemp = temp
        }
        if (temp < minTemp){
            minTemp = temp
        }
        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature =  ${(tempSum / numReadings)} AVG \t $maxTemp MAX\t $minTemp MIN")
    }

}