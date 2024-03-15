package Ficha_06;

/**
 * Dadas 2 matrizes de inteiros com a mesma dimensão, apresenta (numa função) em
 * forma de matriz o resultado da soma das 2 matrizes e (noutra função) o somatório dos seus elementos.
 */
public class Ex_08 {
    //Soma de duas matrizes.
    public static void sumMatrices(int[][] matrixA, int[][] matrixB) {

        int[][] sumMatrices = new int[3][3];

        for (int i = 0; i < sumMatrices.length; i++) {
            for (int j = 0; j < sumMatrices[i].length; j++) {
                sumMatrices[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for (int i = 0; i < sumMatrices.length; i++) {
            for (int j = 0; j < sumMatrices[i].length; j++) {
                System.out.print(sumMatrices[i][j] + "\t|\t");
            }
            System.out.println();
        }
    }
    //Somatório dos elementos das matrizes.
    public static int matrixElementsSum(int[][] matrixA,int[][] matrixB ) {

        int matrixElmentsSum = 0;

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                    matrixElmentsSum += matrixA[i][j];
            }
        }

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixElmentsSum += matrixB[i][j];
            }
        }
        return matrixElmentsSum;
    }

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

        System.out.println("Função 1: Soma das duas matrizes:");
        sumMatrices(matrixA, matrixB);

        System.out.println("\nFunção 2: O somatório dos elementos das duas matriz é: " + matrixElementsSum(matrixA, matrixB));

    }
}
