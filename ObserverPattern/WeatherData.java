package ObserverPattern;

import Task2.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    ArrayList observers ;
    WeatherData()
    {
        observers = new ArrayList();
    }
    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index > 0 ){
            observers.remove(index);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (int i =0;i<observers.size();i++)
        {
            ObserverPattern.Observer o = (ObserverPattern.Observer) observers.get(i);
            o.update();
        }
    }
    public void measurmentsChanged()
    {
        notifyObservers();
    }
    public void setMeasurments(int humidity)
    {

    }
}
