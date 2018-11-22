package Task7;

public class RoundPegAdapter extends SquarePeg{
    RoundPeg roundPeg;
    RoundPegAdapter(RoundPeg roundPeg){
        this.roundPeg = roundPeg;
    }

    @Override
    public double getWidth() {
        return roundPeg.getRadius();
    }

    @Override
    public double getArea() {
        return roundPeg.getArea();
    }
}
