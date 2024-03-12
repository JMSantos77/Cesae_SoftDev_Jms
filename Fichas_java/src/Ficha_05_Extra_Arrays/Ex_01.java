package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbersArray = new int[14];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Insira um número no array: ");
            numbersArray[i] = input.nextInt();
        }

        System.out.println("\nOs elementos do seu array são:");
        for (int j = 0; j < numbersArray.length; j++) {
            System.out.println("Index[" + j + "]: " + numbersArray[j]);
        }
    }
}
