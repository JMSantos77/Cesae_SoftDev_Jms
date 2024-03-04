package Ficha_03;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("\n*** Início do programa Print Even Numbers [2 - X] ***");


        System.out.println("Insira um número inteiro: ");
        num = input.nextInt();

        if (num <= 2) {
            System.out.println("Erro: Insira um número maior que 2.");
        } else {
            System.out.println("Os números pares entre 2 e " + num + " são:");
            for (int i = 2; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
