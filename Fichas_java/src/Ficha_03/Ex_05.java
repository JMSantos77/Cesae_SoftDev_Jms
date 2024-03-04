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

        //input.nextLine(); // Se em baixo usar o input.nextLine() para a mensagem, tenho de usar este para apanhar o enter.

        System.out.println("Insira uma mensagem:");
        message = input.next();
        //message = input.nextLine(); // input.nextLine() permite colocar uma string com espaços.

        for (int i = 1; i <= num; i++) {
            System.out.println(message);
        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
