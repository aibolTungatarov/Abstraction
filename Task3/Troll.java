package Task3;

public class Troll extends Monsters{
    public Troll(){
        attack = "Troll tried to grab u";
        fleeBattle = "Troll lose";
    }
    @Override
    public double getAttackPower() {
        return 1.32;
    }

}
