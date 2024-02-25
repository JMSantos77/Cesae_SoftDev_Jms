package Ficha_03;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, sumA = 0, sumB = 0, sumC = 0, sumD = 0;

        System.out.println("\n*** Início do Programa ***");

        System.out.print("Introduza um número:");
        num = input.nextInt();

        while (num != -1) {
            if (num <= 25) {
                sumA++;
            } else if (num <= 50) {
                sumB++;
            } else if (num <= 75) {
                sumC++;
            } else if (num <= 100) {
                sumD++;
            }
            System.out.print("Introduza um número:");
            num = input.nextInt();
        }
        System.out.println("\nO resultado dos intervalos é:" +
                "\n[00,25]: " + sumA +
                "\n[26,50]: " + sumB +
                "\n[51,75]: " + sumC +
                "\n[76,100]: " + sumD);

        System.out.println("\n*** Fim do Programa ***");
    }
}
