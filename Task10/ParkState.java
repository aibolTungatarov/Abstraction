package Task10;

public class ParkState implements State {
    Car car;
    ParkState(Car car){
        this.car = car;
        car.setMoving(false);
        car.setReverseMoving(false);
    }
    @Override
    public void gas() {
        System.out.println("You can't gas because you are in park state");
        car.setBrakePressed(false);
        car.setMoving(false);
        car.setReverseMoving(false);
    }

    @Override
    public void brake() {
        System.out.println("No need to brake , you are in park state");
        car.setBrakePressed(true);
        car.setMoving(false);
        car.setReverseMoving(false);
    }
}
