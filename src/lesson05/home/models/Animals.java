package lesson05.home.models;

public abstract class Animals {

    protected String name;
    protected int run;
    protected int swim;
    protected int jump;

    public Animals(String name, int run, int swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    public void run() {
        System.out.println(name + " пробежал " + run + "м");
    }

    public void swim() {
        System.out.println(name + " проплыл " + swim + "м");
    }

    public void jump() { System.out.println(name + " прыгнул " + jump + "м"); }

}
