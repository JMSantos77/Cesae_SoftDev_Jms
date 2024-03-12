package Ficha_06;

import java.util.Scanner;

public class Ex_02 {

    //Pedir um número
    public static int askNumber() {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Introduza um número inteiro positivo: ");
            number = input.nextInt();

        } while (number < 0);

        return number;
    }

    //Imprimir um asterisco o número de vezes desejadas
    public static void printChar(int charNumber) {

        for (int i = 0; i < charNumber; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        int numberOfChars = askNumber();

        printChar(numberOfChars);
    }
}
