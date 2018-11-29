package Task10;

public class NeutralState implements State{
    Car car;
    NeutralState(Car car){
        this.car = car;
    }
    @Override
    public void gas() {
        System.out.println("It's not available, u are in neutral state");
    }

    @Override
    public void brake() {
        car.setBrakePressed(true);
    }
}
