package Ficha_06;

import java.util.Objects;
import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String changeNumber = null;
        int operation;

        do {
            System.out.print("Introduza um número para analisar: ");
            int number = input.nextInt();


            System.out.print("Escolha uma Operação ou '7' para sair:\n" +
                    "1. Par ou Ímpar\n" +
                    "2. Positivo ou Negativo\n" +
                    "3. Primo ou Não Primo\n" +
                    "4. Perfeito ou Não Perfeito\n" +
                    "5. Triangular ou Não Triangular\n" +
                    "6. Trocar de Número\n" +
                    "Opção: ");

            operation = input.nextInt();

            switch (operation) {
                case 1:
                    if (Ex_03.isEven(number)) {
                        System.out.print("É Par.");
                    } else {
                        System.out.print("É Impar.");
                    }
                    break;
                case 2:
                    if (Ex_03.isPositive(number)) {
                        System.out.print("É Positivo.");
                    } else {
                        System.out.print("É Negativo.");
                    }
                    break;
                case 3:
                    if (Ex_03.isPrime(number)) {
                        System.out.print("É Primo.");
                    } else {
                        System.out.println("É Não Primo.");
                    }
                    break;
                case 4:
                    if (Ex_03.isPerfect(number)) {
                        System.out.println("O número é Perfeito.");
                    } else {
                        System.out.println("O número é Não Perfeito.");
                    }
                    break;
                case 5:
                    if (Ex_03.isTriangular(number)) {
                        System.out.print("O número é Triangular.");
                    } else {
                        System.out.print("O número é Não Triangular.");
                    }
                    break;
                default:
                    System.out.println();
                    break;
            }

            System.out.println();

            //System.out.println("\nIntroduza um novo número ou 'n' para sair: ");
            //changeNumber = input.next().toLowerCase();

        } while (operation != 7);
    }
}
