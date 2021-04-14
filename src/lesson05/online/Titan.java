package lesson05.online;

public class Titan extends Paladin {

    public Titan(String name, int health, int power, int attack, int defence) {
        super(name, health, power, attack, defence);
    }

    @Override
    public void healSelf(){
        System.out.println(this.name + " can't heal!");
    }
}
