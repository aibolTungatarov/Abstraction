package Task7;

public class Test {
    public static void main(String[] args) {
        RectanglePeg rectanglePeg = new RectanglePeg(100,200);
        SquarePeg rectanglePegAdapter = new RectanglePegAdapter(rectanglePeg);
        RoundPeg roundPeg = new RoundPeg(10);
        RoundPegAdapter roundPegAdapter = new RoundPegAdapter(roundPeg);
        SquareHole squareHole = new SquareHole(10);
        System.out.println(squareHole.fits(roundPegAdapter));
        System.out.println(squareHole.fits(rectanglePegAdapter));
    }
}
