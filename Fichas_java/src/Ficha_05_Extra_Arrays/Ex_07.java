package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arraySize, numberToRemove, count = 0;

        System.out.print("Quantos elementos quer inserir no array?: ");
        arraySize = input.nextInt();

        int[] numbersArray = new int[arraySize];

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Insira um número no array: ");
            numbersArray[i] = input.nextInt();
        }

        System.out.print("\nQue valor deseja remover?: ");
        numberToRemove = input.nextInt();

        for (int j = 0; j < numbersArray.length; j++) {
            if (numbersArray[j] == numberToRemove) {
                count++;
            }
        }
        int[] sortArray = new int[numbersArray.length - count];

        /*
        //Com duas variáveis dentro do ciclo for. K itera a posição para onde se manda o elemento.
        for (int j = 0, k = 0; j < numbersArray.length; j++) {
            if (numbersArray[j] != numberToRemove) {
                sortArray[k] = numbersArray[j];
                k++;
            }
        }
         */

        //A variável da posição em que se coloca o elemento itera fora do for.
        int k = 0;
        for (int j = 0; j < numbersArray.length; j++) {

            if (numbersArray[j] != numberToRemove) {
                sortArray[k++] = numbersArray[j];
            }
        }

        System.out.println("\nOs elementos do seu array são:");
        for (int j = 0; j < sortArray.length; j++) {
            System.out.println("Index[" + j + "]: " + sortArray[j]);
        }
    }
}
