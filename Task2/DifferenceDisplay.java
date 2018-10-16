package Task2;
public class DifferenceDisplay implements DisplayElement,Observer {
    private float lastEuroValue;
    private float lastUSDValue;
    private float USDCurrency;
    private float EuroCurrency;
    private Subject currencyData;
    DifferenceDisplay(Subject currencyData){
        this.currencyData = currencyData;
        currencyData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("USD difference is " +getDifferenceBetween(USDCurrency,lastUSDValue) + " and Euro difference is " + getDifferenceBetween(EuroCurrency,lastEuroValue));
    }
    private float getDifferenceBetween(float lastValue, float currentValue){
        return Math.abs(lastValue-currentValue);
    }

    @Override
    public void update(float USDCurrency, float EuroCurrency) {
        lastEuroValue = this.EuroCurrency;
        lastUSDValue = this.USDCurrency;
        this.USDCurrency = USDCurrency;
        this.EuroCurrency = EuroCurrency;
        display();
    }
}
