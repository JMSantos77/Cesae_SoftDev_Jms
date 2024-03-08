package Ficha_05;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matrix[][] = new int[5][5], matrixElementsSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Insira um número na posição [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
                matrixElementsSum += matrix[i][j];
            }
        }

        System.out.println("\nO valor da soma de todos os elementos da matriz é: " + matrixElementsSum);
    }
}
