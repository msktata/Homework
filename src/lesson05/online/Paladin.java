package lesson05.online;

import lesson05.online.models.Hero;

public class Paladin extends Hero {

    public Paladin(String name, int health, int power, int attack, int defence) {
        super(name, health, power, attack, defence);
    }

    public void defense() {
        System.out.println(this.name + " has defense " + this.defence);
    }

}
