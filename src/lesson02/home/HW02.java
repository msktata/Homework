package lesson02.home;

import java.util.Arrays;

public class HW02 {
    public static void main(String[] args) {

        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        change(array1);
        System.out.println("1:\t" + Arrays.toString(array1));

        int[] arrInt = new int[8];
        fillIn(arrInt);
        System.out.println("2:\t" + Arrays.toString(arrInt));

        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubling(mas);
        System.out.println("3:\t" + Arrays.toString(mas));

        int side = 10;
        int[][] dArr = new int[side][side];
        crossFill(dArr);
        printArraySize2(dArr);

    }

    private static void printArraySize2(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
        array[i] = 1 - array[i];
    }

    private static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i * 3 + 1;
    }

    private static void doubling(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6) {
                array[i] *= 2;
            }
    }

    private static void crossFill(int[][] arr) {
        int lastIndexElement = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

}
