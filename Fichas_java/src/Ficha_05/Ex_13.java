package Ficha_05;

public class Ex_13 {
    public static void main(String[] args) {

        int matrix[][] = {
                {1, 2, 3, 4},
                {4, 6, 7, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 7}
        };
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        System.out.print("\nA soma da diagonal principal da matriz é: " + sum);
    }
}
