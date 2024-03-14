package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[4][3];
        int insert;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Introduza um número na matriz > posição[" + i + "]" + "[" + j + "]: ");
                insert = input.nextInt();
                matrix[i][j] = insert;
            }
        }
/*
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
 */

        //Enhanced for para imprimir resultado.
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t|\t");
            }
            System.out.println();
        }
    }
}
