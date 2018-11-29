package Task10;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.setState(car.getDriveState());
        car.gas();
        car.isMoving();
        car.gas();
        car.brake();
        car.isMoving();
        car.setState(car.getNeutralState());
        car.gas();
        car.isMoving();
        car.setState(car.getReverseState());
        car.gas();
        car.isMoving();
        car.setState(car.getNeutralState());
        car.setSlope(true);
        car.isMoving();
    }
}
