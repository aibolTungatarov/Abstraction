package Practice;

public class Espresso extends Beverage {
    Espresso(){
        description = "Very Nice cofee";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
