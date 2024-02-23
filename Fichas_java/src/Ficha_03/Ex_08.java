package Ficha_03;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("\n*** Início do Programa Print +5 and -5 ***");

        System.out.println("Insira um número inteiro:");
        num = input.nextInt();

        for (int i = num -5; i < num; i++) {
            System.out.println(i);
        }

        for (int i = num + 1; i <= num + 5; i++) {
            System.out.println(i);
        }

        System.out.println("*** Fim do Programa ***");
    }
}
