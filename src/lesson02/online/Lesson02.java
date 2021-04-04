package lesson02.online;

public class Lesson02 {

    public static int fieldInClass = 10;

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int result;

        result = (a > b) ? a : b;
        System.out.println("Result " + result);

        String name = "Alex";

        switch (name) {
            case "Olga":
                System.out.println("Send letter to Olga");
                break;
            case "Boris":
                System.out.println("Send letter to Boris");
                break;
            case "Alex":
                System.out.println("Send letter to Alex");
                break;
            default:
                System.out.println("Go out office");
        }

        int fieldInMethodMain = 45;

        System.out.println("1 call from class " + fieldInClass);
        System.out.println("1 call from main " + fieldInMethodMain);

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();

        System.out.println(myMath(2, 10));

        printPifagor(10, 10);

        int c = 0;
        while (c < 10) {
            c++;
            if (c == 3 || c == 8) {
                continue;
            }
            System.out.print(c + " | ");
        }
        System.out.println("\nend while");

        int d = 0;
        do {
            d++;
            System.out.print(d + " | ");
            if (d == 15) {
                break;
            }
        } while (d < 10);
        System.out.println("\nend do-while");

        int[] array = new int[10];

        array[0] = 55;
        array[1] = 698;
        array[2] = 300;

        System.out.println(array[1] + " " + array[2]);

        String[] strArray = new String[25];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "Value " + i;
        }
        writeArray("Value", strArray);
        readArray(strArray);

        float[] myFloatArray = {10.5f, 15.9f, 200.987f};
        System.out.print(myFloatArray.length + " {");

        for (int i = 0; i < myFloatArray.length; i++) {
            System.out.print(myFloatArray[i] + " ,");
        }
        System.out.print("}");

        System.out.println();

        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " | ");
        }

        int[][] doubleArrayInt = new int[3][4];
        doubleArrayInt[0][1] = 15;

        System.out.println(doubleArrayInt[0][1]);

        int value = 0;

        for (int y = 0; y < doubleArrayInt.length; y++) {
            for (int x = 0; x < doubleArrayInt[y].length; x++) {
                doubleArrayInt[y][x] = value;
                value++;
            }
        }

        for (int y = 0; y < doubleArrayInt.length; y++) {
            for (int x = 0; x < doubleArrayInt[y].length; x++) {
                System.out.print(doubleArrayInt[y][x] + " | ");
            }
            System.out.println();
        }

    }

    public static int myMath(int base, int signature) {
        int result = 1;
        for (int i = 0; i < signature; i++) {
            result *= base;
        }
        return result;
    }

    public static void printPifagor(int width, int height) {
        for (int y = 1; y < height; y++) {
            for (int x = 1; x < width; x++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();
        }
    }

    public static void writeArray(String value, String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = value + " " + i;
        }
    }

    public static void readArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " | ");
        }
        System.out.println();
    }

}
