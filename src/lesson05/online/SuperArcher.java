package lesson05.online;

public class SuperArcher extends Archer {

    public SuperArcher(String name, int health, int power, int attack, int defence, int speed){
        super(name, health, power, attack, defence, speed);
    }

    public void superAttack(){
        System.out.println(this.name + " super attack " + this.attack * this.speed);
    }

}
