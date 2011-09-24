/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package weatherstation;

/**
 *
 * @author michael
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    public Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        System.out.println(this);
        weatherData.registerObserver(this);
    }

    public void update(float temp,float humidity, float pressure){
        this.temperature= temp;
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println("Current conditions: " + temperature + "F degrees and "+ humidity + "% humidity" + " Pressure " + pressure);
    }
}
