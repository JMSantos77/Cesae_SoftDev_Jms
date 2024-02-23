package Ficha_03;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        String message;

        System.out.println("\n*** Início do Programa ***");

        System.out.println("Insira um número:");
        num = input.nextInt();

        System.out.println("Insira uma mensagem:");
        message = input.next();

        for (int i = 1; i <= num; i++) {
            System.out.println(message);
        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
