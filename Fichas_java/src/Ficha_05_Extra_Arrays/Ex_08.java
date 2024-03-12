package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arraySize, numberToAdd, index;

        System.out.print("Quantos elementos quer inserir no array?: ");
        arraySize = input.nextInt();

        int[] numbersArray = new int[arraySize];
        int[] numbersArrayPlus = new int[arraySize + 1];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Insira um número no array[" + i + "]: ");
            numbersArray[i] = input.nextInt();
        }

        System.out.print("\nQue valor extra deseja adicionar?: ");
        numberToAdd = input.nextInt();

        System.out.print("Em que index o deseja adicionar (0-" + (numbersArray.length - 1) + ")?: ");
        index = input.nextInt();

        for (int i = 0, k = 0; i < numbersArrayPlus.length; i++) {
            if (i != index) {
                numbersArrayPlus[i] = numbersArray[k];
                k++;
            } else {
                numbersArrayPlus[i] = numberToAdd;
            }
        }

        System.out.println("\nOs elementos do seu array são:");
        for (int j = 0; j < numbersArrayPlus.length; j++) {
            System.out.println("Index[" + j + "]: " + numbersArrayPlus[j]);
        }
    }
}
