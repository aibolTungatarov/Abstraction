package Task3;

public class Ogr extends Monsters {
    public Ogr(){
        attack = "Ogr tried to grab u";
        fleeBattle = "Ogr lose";
    }
    @Override
    public double getAttackPower() {
        return 2;
    }
}
