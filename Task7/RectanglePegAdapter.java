package Task7;

public class RectanglePegAdapter extends SquarePeg{
    RectanglePeg rectanglePeg;
    RectanglePegAdapter(RectanglePeg rectanglePeg){
        this.rectanglePeg = rectanglePeg;
    }

    @Override
    public double getWidth() {
        return rectanglePeg.getWidth() > rectanglePeg.getHeight() ? rectanglePeg.getWidth() : rectanglePeg.getHeight();
    }

    @Override
    public double getArea() {
        return rectanglePeg.getArea();
    }
}
