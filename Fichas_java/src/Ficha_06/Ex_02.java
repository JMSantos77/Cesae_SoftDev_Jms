package Ficha_06;

import java.util.Scanner;

public class Ex_02 {
    public static int askNumber() {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Introduza um número inteiro positivo: ");
            number = input.nextInt();

        } while (number < 0);

        return number;
    }

    public static String printChar(int charNumber) {

        String printChar = "";

        for (int i = 0; i < charNumber; i++) {
            System.out.print("*");
        }
        return printChar;
    }

    public static void main(String[] args) {

        int numberOfChars = askNumber();

        printChar(numberOfChars);
    }
}
