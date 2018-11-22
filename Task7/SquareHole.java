package Task7;

public class SquareHole {
    private double width;
    SquareHole(double w){
        this.width = w;
    }

    public double getWidth() {
        return width;
    }
    public double getArea() {
        return width*width;
    }
    boolean fits (SquarePeg peg){
        return freeSpace(peg) >= 0 ? true : false ;
    }
    double freeSpace(SquarePeg peg){
        return this.getArea() - peg.getArea() ;
    }

}
