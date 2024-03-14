package Ficha_05_Extra_Arrays;

public class Ex_15 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2},
                {4, 5},
                {7, 8},
        };

        double sum = 0, count = 0, average = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }

        average = sum / count;

        System.out.print("A média dos elementos da matriz é: " + average);
    }
}
