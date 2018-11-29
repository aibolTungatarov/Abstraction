package Task10;

public class ReverseState implements State {
    Car car;
    ReverseState(Car car){
        this.car = car;
    }
    @Override
    public void gas() {
        car.setReverseMoving(true);
        car.setMoving(false);
        car.setBrakePressed(false);
    }

    @Override
    public void brake() {
        car.setBrakePressed(true);
        car.setMoving(false);
        car.setReverseMoving(false);
    }
}
