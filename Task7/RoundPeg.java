package Task7;

public class RoundPeg {
    private double radius;
    RoundPeg(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 2*Math.PI*radius;
    }

}
