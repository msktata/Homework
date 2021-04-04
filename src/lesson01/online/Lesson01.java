package lesson01.online;

public class Lesson01 {

    public static void main(String[] args) {
        System.out.println("Hello Junior Java Development!!!");

        //целочисленные
        byte myByte = 35;
        short myShort = 3500;
        int myInt = 2500000;
        long myLong = 3500000000L;

        //числа с плавающей точкой
        float myFloat = 15.86f;
        double myDouble = 15.86;

        //логическая переменная
        boolean myBoolean = false;

        //символы
        char myChar = 'T';
        int valueTest1 = 74;
        char valueChar = (char) valueTest1;
        int valueInteger = myChar;
        System.out.println(valueTest1);
        System.out.println(valueChar);
        System.out.println(valueInteger);

        //String
        String myString1 = "Hello ";
        String myString2 = "Blue DuctTape";
        System.out.println(myString1 + myString2);
        System.out.println(1 + " - this is ONE");

        float test1 = 15;
        System.out.println(test1);

        float a = 15;
        float b = 4.9f;
        int c = 100;
        float result = a * b;

        System.out.println(a + b * c);

        int abc = 1;
        abc += 11;
        System.out.println(abc);

        int cde = 121;
        cde++;
        cde--;
        System.out.println(cde);

        int f = 45;

        if (f > 10) {
            System.out.println("ok");
        } else {
            System.out.println("not ok!");
        }

        int g = 30;
        if (g < 5) {
            System.out.println("g = ok");
        }

        int age = 34;

        if (age < 18) {
            System.out.println("Вам нет 18 лет");
        } else if (age > 60) {
            System.out.println("Вы уже стары, пожалейте здоровье");
        } else {
            System.out.println("Ваша покупка. Спасибо");
        }

        int h=15;
        int i=5;
        int result1;

//        result = h + i;
        result1 = myMath(h, i, 20);
        h++;
        result1 = myMath(h, i, 50);
        i++;
        result1 = myMath(h, i, 100);
        h++;
        result1 = myMath(h, i, 0);
        System.out.println(result1);
        doSomething1();
        doSomething1();
        doSomething1();
        doSomething1();

        doSomething2(15);
        doSomething2(35);
        doSomething2(90.986f);

    }

    public static int myMath(int valueA, int valueB, int valueC) {
        return valueA * valueB + valueC;
    }

    public static void doSomething1() {
        System.out.println("Hello 1 ");

    }

    public static void doSomething2(float inputValue) {
        System.out.println("My value is = " + inputValue);
    }

}
