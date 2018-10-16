package Task3;

public class Org extends Monsters {
    public Org(){
        attack = "Org tried to grab u";
        fleeBattle = "Org lose";
    }
    @Override
    public double getAttackPower() {
        return 2;
    }
}
