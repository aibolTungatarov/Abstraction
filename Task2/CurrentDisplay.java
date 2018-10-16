package Task2;
public class CurrentDisplay implements Observer,DisplayElement{
    private float USDCurrency;
    private float EuroCurrency;
    private Subject currencyData;
    CurrentDisplay(Subject currencyData){
        this.currencyData = currencyData;
        currencyData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("USD value is "+USDCurrency + " and Euro value is " + EuroCurrency);
    }

    @Override
    public void update(float USDCurrency, float EuroCurrency) {
        this.USDCurrency = USDCurrency;
        this.EuroCurrency = EuroCurrency;
        display();
    }
}
