package lesson04.online;

public class Hero {

    public static int countHead = 2;

    private String name;
    private int age;
    private int health;
    private int speed;
    private  Sword sword;

    public Hero(int valueAge){
        age = valueAge;
    }

    public Hero(String name,
                int age,
                int health,
                int speed) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.speed = speed;
        Sword sword = new Sword(2,"Sword", 8, 99);
    }

    public static class Sword {
        private int atk;
        String name = "King Patrik";
        int dex;
        int atkSpd;

        public Sword(int atk, String name, int dex, int atkSpd) {
            this.atk = atk;
            this.name = name;
            this.dex = dex;
            this.atkSpd = atkSpd;
            System.out.println(name + " has been created");
        }
    }

    void getDamage(){
        System.out.println("Our hero " + name + " deals damage " + sword.atk);
    }

    void speak() {
        System.out.println(name + " says Hello!");
    }

 //   public void heroRun(){
 //       run();
 //   }

    void run(){
        System.out.println(name + " has speed " + speed + " points");
    }

    void healSelf(int value){
        System.out.println("Before " + health + " points");
        health += value;
        System.out.println("After " + health + " points");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return age;
    }

    public int getHealth(){
        return health;
    }

    public int getSpeed(){
        return speed;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void voice(){
        System.out.println("Hero speak");
    }
}
