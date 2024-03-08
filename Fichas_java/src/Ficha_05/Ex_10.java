package Ficha_05;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matrix[][] = new int[3][5], searchNumber, count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Insira um número na posição [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.print("\nInsira um número para pesquisar: ");
        searchNumber = input.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == searchNumber) {
                    count++;
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

        System.out.println("\nHá " + count + " posições na matriz com o número " + searchNumber);
    }
}
