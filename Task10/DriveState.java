package Task10;

public class DriveState implements State {
    Car car;
    DriveState(Car car){
        this.car = car;
    }
    @Override
    public void gas() {
        car.setMoving(true);
        car.setBrakePressed(false);
        car.setReverseMoving(false);
    }

    @Override
    public void brake() {
        car.setMoving(false);
        car.setReverseMoving(false);
        car.setBrakePressed(true);
    }
}
