package Practice;

public class Test {
    public static void main(String[] args) {
        Beverage beverage  = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " " + beverage2.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " " + beverage.cost());
    }
}
