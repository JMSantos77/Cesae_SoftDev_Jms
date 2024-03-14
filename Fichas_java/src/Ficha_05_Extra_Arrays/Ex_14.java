package Ficha_05_Extra_Arrays;

public class Ex_14 {
    public static void main(String[] args) {

        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int[][] matrixB = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18},
        };

        int[][] sumMatrix = new int[3][3];

        //Soma as duas matrizes.
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        //Enhanced for para imprimir resultado.
        for (int[] ints : sumMatrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t|\t");
            }
            System.out.println();
        }
    }
}
