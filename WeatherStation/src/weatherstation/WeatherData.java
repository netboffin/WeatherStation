
package weatherstation;
import java.util.*;

public class WeatherData  implements Subject{
    private List<Observer> observers;
    private float temperature=3.0f;
    private float humidity=3.0f;
    private float pressure=3.0f;

    public WeatherData(){
        // constructors don't have return types like void or int
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o){

        
       observers.add(o);
    }
    public void removeObserver(Observer o){
        //remove an observer
       int i = observers.indexOf(o);
       if(i >= 0)
       {
         observers.remove(i);
       }
    }
    public void notifyObservers(){
    // tell the observers that the weather data has changed and update them
        for(int i = 0;i< observers.size(); i++)
        {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature,humidity, pressure);
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
                return temperature;
        }

        public float getHumidity() {
                return humidity;
        }

        public float getPressure() {
                return pressure;
        }


}
