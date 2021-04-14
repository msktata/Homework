package lesson05.online;

import lesson05.online.models.Hero;

public class Mage extends Hero {

    public Mage(String name, int health, int power, int attack, int defence) {
        super(name, health, power, attack, defence);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println(name + " says Hello-Hello-Hello-Hello");
    }

}
