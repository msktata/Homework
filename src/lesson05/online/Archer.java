package lesson05.online;

import lesson05.online.models.Hero;

public class Archer extends Hero {

    protected int speed;

    public Archer(String name, int health, int power, int attack, int defence) {
        super(name, health, power, attack, defence);
    }

    public Archer(String name, int health, int power, int attack, int defence, int speed) {
        super(name, health, power, attack, defence);
        this.speed = speed;
    }

}
