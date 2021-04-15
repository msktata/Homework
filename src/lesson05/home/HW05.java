package lesson05.home;

import lesson05.home.models.Animals;
import lesson05.home.Dog;
import lesson05.home.Horse;
import lesson05.home.Bird;
import lesson05.home.Cat;

public class HW05 {

    public static void main(String[] args) {

        Dog dog = new Dog("Dog", 500, 10, 05);
        Horse horse = new Horse("Horse", 1500, 100, 3);
        Bird bird = new Bird("Bird", 5, 0, 02);
        Cat cat = new Cat("Cat", 200, 0, 2);

        dog.run();
        dog.swim();
        dog.jump();

        horse.run();
        horse.swim();
        horse.jump();

        bird.run();
        bird.swim();
        bird.jump();

        cat.run();
        cat.swim();
        cat.jump();
    }


}
