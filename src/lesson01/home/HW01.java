package lesson01.home;

public class HW01 {

    public static void main(String[] args) {
        float a = 10f;
        float b = 20f;
        float c = 30f;
        float d = 40f;

        System.out.println("1: " + calculate(a, b, c, d));
        System.out.println("2: " + checkNumbers(3, 17));

        if (isPositive(-1)) {
            System.out.println("3: Positive");
        } else {
            System.out.println("3: Negative");
        }

        System.out.println("4: " + welcome("Танчик"));
    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + c / d);
    }

    public static boolean checkNumbers(int first, int second) {
        return first + second <= 20 && first + second >= 10;
    }

    public static boolean isPositive(int variable) {
        return variable >= 0;
    }

    public static String welcome(String name) {
        return "Привет, " + name + "!";
    }
}