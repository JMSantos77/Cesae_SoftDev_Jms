package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int[] numbersArray = new int[10];
        int[] numbersArray = {10,32,30,400,40,60,10,22,11,1};
        int[] sortedArray = new int[10];

        /*
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Insira um número no array[" + i + "]: ");
            numbersArray[i] = input.nextInt();
        }
         */

        sortedArray[0] = numbersArray[0];

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray.length; j++) {
                if (numbersArray[i] < sortedArray[j]) {
                    sortedArray[i] = numbersArray[i];
                }
            }
        }


        System.out.println("\nOs elementos do seu array são:");
        for (int j = 0; j < sortedArray.length; j++) {
            System.out.println("Index[" + j + "]: " + sortedArray[j]);
        }
    }
}
