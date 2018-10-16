package Task3;

public abstract class Monsters {
    String attack = "";
    String fleeBattle = "";
    public String getAttack() {
        return attack;
    }

    public String getFleeBattle() {
        return fleeBattle;
    }

    public abstract double getAttackPower();
}
