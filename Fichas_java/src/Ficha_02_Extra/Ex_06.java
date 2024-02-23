package Ficha_02_Extra;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.println("\n*** Início do programa Verificação de Ano Bissexto ***");
        System.out.println("Insira um ano:");
        year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("É bissexto.");
        } else {
            System.out.println("Não é bissexto.");
        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
