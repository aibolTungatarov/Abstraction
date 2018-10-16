package Task3;

public class Vampire extends Monsters{
    public Vampire(){
        attack = "Vampire tried to grab u";
        fleeBattle = "Vampire lose";
    }

    @Override
    public double getAttackPower() {
        return 0.98;
    }
}
