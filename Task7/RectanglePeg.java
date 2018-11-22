package Task7;

public class RectanglePeg {
    private double width, height;
    RectanglePeg( double w, double h){
        this.height = h;
        this.width = w;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public double getArea() {
        return height * width;
    }

}
