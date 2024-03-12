package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int countEven = 0, countOdd = 0;

        //Descobrir tamanho dos arrays.
        for (int i = 0, k = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        int[] evenArray = new int[countEven];
        int[] oddArray = new int[countOdd];

        //Enviar números para array de pares ou de ímpares.
        for (int i = 0, j = 0, k = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenArray[j] = numbers[i];
                j++;
            } else {
                oddArray[k] = numbers[i];
                k++;
            }
        }

        //Imprimir ambos os arrays.
        System.out.println("Array de Pares:");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " | ");
        }

        System.out.println();

        System.out.println("Array de Ímpares:");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " | ");
        }
    }
}
