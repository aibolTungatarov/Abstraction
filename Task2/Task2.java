package Task2;
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Subject currencyData = new CurrencyData();
        CurrentDisplay currentDisplay = new CurrentDisplay(currencyData);
        DifferenceDisplay differenceDisplay = new DifferenceDisplay(currencyData);
        float num1 = 300;
        float num2 = 300;
        while(true){
            float random1 = (float)(Math.random()*2);
            float random2 = (float)(Math.random()*2);
            int random_sign1 = (int) (Math.random()*2);
            int random_sign2 = (int) (Math.random()*2);
            if(random_sign1 == 0 && random_sign2 == 0){ // if 0 + if 1 -
                ((CurrencyData) currencyData).setMeasurements(num1+random1,num2+random2);
            }
            if(random_sign1 == 1 && random_sign2 == 1){ // if 0 + if 1 -
                ((CurrencyData) currencyData).setMeasurements(num1-random1,num2-random2);
            }
            if(random_sign1 == 1 && random_sign2 == 0){ // if 0 + if 1 -
                ((CurrencyData) currencyData).setMeasurements(num1-random1,num2+random2);
            }
            if(random_sign1 == 0 && random_sign2 == 1){ // if 0 + if 1 -
                ((CurrencyData) currencyData).setMeasurements(num1+random1,num2-random2);
            }
            Thread.sleep(2000);
        }




    }
}
