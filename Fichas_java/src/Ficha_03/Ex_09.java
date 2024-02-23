package Ficha_03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, sum = 0, count = 0;

        System.out.println("\n*** Início do Programa ***");

        System.out.println("Introduza um número inteiro:");
        num = input.nextInt();

        while (num != -1) {
            sum += num;
            count++;
            System.out.println("Introduza um número inteiro:");
            num = input.nextInt();
        }

        double average = (double) sum / count;

        System.out.println("A média é: " + average);

        System.out.println("\n*** Fim do Programa ***");
    }
}
