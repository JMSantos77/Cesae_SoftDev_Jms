package Ficha_03;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("\n*** Início do programa Print integers until X ***");
        System.out.println("Insira um número inteiro:");
        num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

        System.out.println("*** Fim do Programa ***");
    }
}
