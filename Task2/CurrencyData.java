package Task2;
import java.util.ArrayList;

public class CurrencyData implements Subject {
    private ArrayList<Observer> observers ;
    private float USDCurrency;
    private float EuroCurrency;
    private float lastUSDValue;
    private float lastEuroValue;
    CurrencyData(){
        observers = new ArrayList<>();
    }
    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index>=0){
            observers.remove(index);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(USDCurrency,EuroCurrency);
        }
    }
    public void notifyObserver(Observer o){
        o.update(USDCurrency,EuroCurrency);
    }
    private void measurementChanged(){
        if(getDifferenceBetween(USDCurrency,lastUSDValue) > 2 || getDifferenceBetween(lastEuroValue,EuroCurrency) > 2){
            notifyObservers();
        }
    }
    private float getDifferenceBetween(float lastValue, float currentValue){
        return Math.abs(lastValue-currentValue);
    }
    void setMeasurements(float USDCurrency, float EuroCurrency){
        lastEuroValue = this.EuroCurrency;
        lastUSDValue = this.USDCurrency;
        this.EuroCurrency = EuroCurrency;
        this.USDCurrency = USDCurrency;
        measurementChanged();
    }

    public float getEuroCurrency() {
        return EuroCurrency;
    }

    public float getUSDCurrency() {
        return USDCurrency;
    }

    public float getLastEuroValue() {
        return lastEuroValue;
    }

    public float getLastUSDValue() {
        return lastUSDValue;
    }
}
