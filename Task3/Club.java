package Task3;

import Practice.Beverage;

public class Club extends MonsterDecorator {
    private Monsters monsters;
    public Club(Monsters monsters){
        this.monsters = monsters;
    }
    @Override
    public String getFleeBattle() {
        return "Loosed his club and run away. " + monsters.getFleeBattle();
    }

    @Override
    public double getAttackPower() {
        return 30 + monsters.getAttackPower();
    }

    @Override
    public String getAttack() {
        return monsters.getAttack() + ". " + "Attacked with club" ;
    }
}
