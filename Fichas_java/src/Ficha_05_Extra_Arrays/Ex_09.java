package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_09 {
    /**
     * Método Bubble sort.
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Array Ordenado:");
        for (int element : array) {
            System.out.print(element + "|");
        }

    }
}
