package Ficha_05;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers[][] = new int[3][3], insert;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print("Insira um número na posição [" + i + "][" + j + "]: ");
                insert = input.nextInt();
                numbers[i][j] = insert;
            }
        }

        System.out.println("\nA sua matriz tem este aspecto:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
