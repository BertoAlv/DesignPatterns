package patterns.observer

fun main() {

    var weatherData = WeatherData()

    var currentDisplay: CurrentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    var statisticsDisplay: StatisticsDisplay = StatisticsDisplay(weatherData)
    var forecastDisplay: ForecastDisplay = ForecastDisplay(weatherData)

    weatherData.setMeasurements(80f,65f,30.4f)
    weatherData.setMeasurements(82f,70f,29.2f)
    weatherData.setMeasurements(77f,90f,30.4f)

    weatherData.removeObserver(forecastDisplay)

    weatherData.setMeasurements(91f,70f,30.4f)

}