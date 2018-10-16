package Task3;

public class Knife extends MonsterDecorator{
    private Monsters monsters;
    public Knife(Monsters monsters){
        this.monsters = monsters;
    }
    @Override
    public String getFleeBattle() {
        return monsters.getFleeBattle() +"."+"Loosed his knife and run away";
    }

    @Override
    public double getAttackPower() {
        return 20 + monsters.getAttackPower();
    }

    @Override
    public String getAttack() {
        return monsters.getAttack() + "." + "Attacked with knife";
    }
}


