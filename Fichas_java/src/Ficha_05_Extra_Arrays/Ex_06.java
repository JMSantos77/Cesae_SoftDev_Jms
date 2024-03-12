package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arraySize;

        System.out.print("Quantos elementos quer inserir no array?: ");
        arraySize = input.nextInt();

        int[] numbersArray = new int[arraySize];

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
