package Ficha_05_Extra_Arrays;

public class Ex_16 {
    public static void main(String[] args) {

        int[][] matrix = {
                {3, 2, 11},
                {4, 5, 1},
                {7, 8, 10},
        };

        int highestElement = matrix[0][0], lowestElement = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > highestElement) {
                    highestElement = matrix[i][j];
                } else if (matrix[i][j] < lowestElement) {
                    lowestElement = matrix[i][j];
                }
            }
        }
        System.out.println("Maior elemento: " + highestElement + "\nMenor Elemento: " + lowestElement);
    }
}
