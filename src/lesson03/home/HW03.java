package lesson03.online;

import java.util.Random;
import java.util.Scanner;

public class HW03 {

    public static char[][] field;
    public static int fieldSizeX;
    public static int fieldSizeY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createField() {
        fieldSizeX = 3;
        fieldSizeY = 3;
        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = empty;
            }
        }
    }

    public static void viewField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void turnHuman() {
        int cellX;
        int cellY;

        do {
            System.out.println("Enter coordinates cell: ");
            cellX = scanner.nextInt() - 1;
            cellY = scanner.nextInt() - 1;
        } while (!validCell(cellY, cellX) || !emptyCell(cellY, cellX));
        field[cellY][cellX] = human;
    }

    public static void turnAI() {
        int cellX;
        int cellY;

        do {
            cellX = random.nextInt(fieldSizeX);
            cellY = random.nextInt(fieldSizeY);
        } while (!emptyCell(cellY, cellX));
        field[cellY][cellX] = ai;
    }

    public static boolean winGame(char player) {
        if (field[0][0] == player && field[0][1] == player && field[0][2] == player) return true;
        if (field[1][0] == player && field[1][1] == player && field[1][2] == player) return true;
        if (field[2][0] == player && field[2][1] == player && field[2][2] == player) return true;

        if (field[0][0] == player && field[1][0] == player && field[2][0] == player) return true;
        if (field[0][1] == player && field[1][1] == player && field[2][1] == player) return true;
        if (field[0][2] == player && field[1][2] == player && field[2][2] == player) return true;

        if (field[0][0] == player && field[1][1] == player && field[2][2] == player) return true;
        if (field[0][2] == player && field[1][1] == player && field[2][0] == player) return true;
        return false;
    }

    public static boolean draw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == empty) return false;
            }
        }
        return true;
    }

    public static boolean validCell(int cellY, int cellX) {
        return cellX >= 0 && cellX < fieldSizeX && cellY >= 0 && cellY < fieldSizeY;
    }

    public static boolean emptyCell(int cellY, int cellX) {
        return field[cellY][cellX] == empty;
    }

    public static void main(String[] args) {

        createField();
        viewField();

        while(true) {

            turnHuman();
            viewField();

            if (winGame(human)) {
                System.out.println("Human win!!!");
                break;
            }

            if (draw()) {
                System.out.println("DRAW!!!");
                break;
            }

            turnAI();
            viewField();

            if (winGame(ai)) {
                System.out.println("AI win!!!");
                break;
            }

            if (draw()) {
                System.out.println("DRAW!!!");
                break;
            }
        }
    }
}
