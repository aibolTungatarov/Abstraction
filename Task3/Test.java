package Task3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Monsters troll = new Troll();
        troll = new Knife(troll);
        troll = new Knife(troll);
        System.out.println(troll.getAttack());
        System.out.println(troll.getFleeBattle());
        System.out.println(troll.getAttackPower());
    }
}