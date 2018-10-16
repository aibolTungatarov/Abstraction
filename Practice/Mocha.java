package Practice;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " with mocha";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
