package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbersArray = new int[10];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Insira um número no array: ");
            numbersArray[i] = input.nextInt();
        }

        System.out.println("\nOs elementos do seu array são:");
        for (int j = numbersArray.length - 1; j >= 0; j--) {
            System.out.println("Index[" + j + "]: " + numbersArray[j]);
        }
    }
}
