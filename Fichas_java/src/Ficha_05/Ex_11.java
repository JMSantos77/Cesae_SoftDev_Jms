package Ficha_05;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matrix[][] = new int[3][3], lowestNumber = 0, highestNumber = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Insira um número na posição [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        lowestNumber = matrix[0][0];
        highestNumber = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < lowestNumber) {
                    lowestNumber = matrix[i][j];
                }
                if (matrix[i][j] > highestNumber) {
                    highestNumber = matrix[i][j];
                }
            }
        }

        System.out.println("\nEsta é a sua matriz:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nO elemento mais alto é: " + highestNumber + "\nO elemento mais baixo é: " + lowestNumber);
    }
}
