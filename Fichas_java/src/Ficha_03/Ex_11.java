package Ficha_03;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, jumpNumber;

        System.out.println("\n*** Início do Programa ***");

        System.out.println("Introduza um número limite:");
        num = input.nextInt();

        System.out.println("Introduza um salto:");
        jumpNumber = input.nextInt();

        for (int i = 0; i < num; i += jumpNumber) {
            System.out.println(i);

        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
