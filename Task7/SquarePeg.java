package Task7;

public class SquarePeg {
    private double width;
    SquarePeg(){

    }
    SquarePeg(double w){
        this.width = w;
    }

    public double getWidth() {
        return width;
    }
    public double getArea() {
        return width*width;
    }
}
