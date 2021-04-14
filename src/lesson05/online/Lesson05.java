package lesson05.online;

import lesson05.online.models.Hero;
import lesson05.online.Paladin;
import lesson05.online.Archer;
import lesson05.online.Mage;

public class Lesson05 {

    public static void main(String[] args) {

        Paladin paladin = new Paladin("Paladin", 100, 50, 25, 10);
        Archer archer = new Archer("Archer", 50, 100, 50, 1);
        Mage mage = new Mage("Mage", 20, 120, 120, 0);
        Titan titan = new Titan("Titan", 20000, 999, 999, 999);
        SuperArcher superArcher = new SuperArcher("SuperArcher", 150, 150, 500, 20, 280);

        paladin.speak();
        paladin.dealDamage();
        paladin.healSelf();
        paladin.defense();

        mage.speak();

        titan.healSelf();

        superArcher.superAttack();

        Hero[] army = {paladin, archer, mage, titan, superArcher};
        for (int i = 0; i < army.length; i++) {
            army[i].dealDamage();
            if (army[i] instanceof SuperArcher) {
                SuperArcher tmp = (SuperArcher) army[i];
                tmp.superAttack();
                ((SuperArcher) army[i]).superAttack();
            }
            if (army[i] instanceof Paladin) {
                ((Paladin) army[i]).defense();
            }
        }

        Object[] myArray = new Object[4];

        int a = 10;
        String myString = "Hello";
        char b = 'H';

        myArray[0] = a;
        myArray[1] = myString;
        myArray[2] = b;
        myArray[3] = paladin;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] instanceof Paladin) {
                ((Paladin) myArray[i]).dealDamage();
            }
            if (myArray[i] instanceof String) {
                System.out.println(((String) myArray[i]).length());
            }
        }
    }
}
