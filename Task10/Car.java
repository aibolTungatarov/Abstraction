package Task10;

public class Car {
    State parkState;
    State driveState;
    State neutralState;
    State reverseState;
    State state = parkState;
    private boolean slope;
    private boolean moving;
    private boolean brakePressed;
    private boolean reverseMoving;
    Car(){
        parkState = new ParkState(this);
        driveState = new DriveState(this);
        neutralState = new NeutralState(this);
        reverseState = new ReverseState(this);
    }

    public void setBrakePressed(boolean brakePressed) {
        this.brakePressed = brakePressed;
    }

    public boolean isBrakePressed() {
        return brakePressed;
    }

    public boolean isSlope() {
        return slope;
    }

    public void setSlope(boolean slope) {
        this.slope = slope;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public void setReverseMoving(boolean reverseMoving) {
        this.reverseMoving = reverseMoving;
    }

    public void isMoving() {
        if(moving){
            System.out.println("moving");
        }
        else if(reverseMoving){
            System.out.println("moving in opposite direction");
        }
        else if(!moving && !reverseMoving){
            if(this.isSlope() && !isBrakePressed() && this.state == this.neutralState){
                System.out.println("You are falling");
            }
            else{
                System.out.println("stays");
            }
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        reverseMoving = false;
        moving = false;
        brakePressed = false;
    }
    public void gas(){
        state.gas();
    }
    public void brake(){
        state.brake();
    }

    public State getDriveState() {
        return driveState;
    }

    public State getNeutralState() {
        return neutralState;
    }

    public State getParkState() {
        return parkState;
    }

    public State getReverseState() {
        return reverseState;
    }
}
