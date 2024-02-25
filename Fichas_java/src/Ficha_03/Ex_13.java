package Ficha_03;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int intervalStart, intervalEnd;

        System.out.println("\n*** Início do Programa Múltiplos de 5 ***");

        System.out.print("Insira o início do intervalo: ");
        intervalStart = input.nextInt();

        System.out.print("Insira o fim do intervalo: ");
        intervalEnd = input.nextInt();

        System.out.println("\nOs múltiplos de 5 são:");

        for (int i = intervalStart; i <= intervalEnd; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
