package lesson05.online.models;

public abstract class Hero {

    protected String name;
    protected int health;
    protected int power;
    protected int attack;
    protected int defence;

    public Hero(String name, int health, int power, int attack, int defence) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.attack = attack;
        this.defence = defence;
    }

    public void speak() {
        System.out.println(name + " says Hello");
    }

    public void dealDamage() {
        System.out.println(name + " deals damage " + power * attack);
    }

    public void healSelf() {
        health += 20;
        System.out.println(name + " heal self! My health now is " + health);
    }

}
