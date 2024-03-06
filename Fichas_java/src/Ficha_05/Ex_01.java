package Ficha_05;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros[] = new int[10], insert;

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um número no array: ");
            insert = input.nextInt();
            numeros[i] = insert;
        }

        System.out.println("\nOs números inseridos no array são:");
        for (int i = 0; i < 10; i++) {
            System.out.println("index " + i + ": " + numeros[i]);
        }


    }
}
