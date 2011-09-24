/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherstation;

/**
 *
 * @author michael
 */
public class WeatherStation {
public static void main(String[] args){
    //Create our WeatherData Subject - The One side of the one to many relationship
    WeatherData wd1 = new WeatherData();

    //Create an observer
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(wd1);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(wd1);
    ForecastDisplay forecastDisplay = new ForecastDisplay(wd1);
    //call the setMeasurements method on the Subject which will then
    //update the observers because the values have changed.
    wd1.setMeasurements(80,65,30.4f);
    wd1.setMeasurements(82,70,29.2f);
    wd1.setMeasurements(78,90,29.2f);

}
}
