package Practice;

public class HouseBlend extends Beverage {

    HouseBlend(){
        description = "hot and delicious";
    }
    @Override
    public double cost() {
        return 1.22;
    }
}
