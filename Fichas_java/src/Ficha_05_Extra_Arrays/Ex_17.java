package Ficha_05_Extra_Arrays;

/**
 * Programa que lê uma matriz 3x3, de seguida encontra o segundo maior e o segundo menor
 * elemento (assumindo que são todos diferentes).
 */

public class Ex_17 {

    public static void main(String[] args) {

        int[][] matrix = {
                {3, 2, 11},
                {4, 5, 1},
                {7, 8, 10},
        };

        int highestElement = matrix[0][0], lowestElement = matrix[0][0], previousHighest = highestElement, previousLowest = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > highestElement) {
                    previousHighest = highestElement;
                    highestElement = matrix[i][j];
                } else if (matrix[i][j] > previousHighest && matrix[i][j] != highestElement) {
                    previousHighest = matrix[i][j];
                }

                if (matrix[i][j] < lowestElement) {
                    previousLowest = lowestElement;
                    lowestElement = matrix[i][j];
                } else if (matrix[i][j] < previousLowest && matrix[i][j] != lowestElement) {
                    previousLowest = matrix[i][j];
                }
            }

        }
        System.out.println("Maior elemento: " + highestElement + "\nMenor Elemento: " + lowestElement);
        System.out.println("\nSegundo maior elemento: " + previousHighest + "\nSegundo menor elemento: " + previousLowest);
    }
}

