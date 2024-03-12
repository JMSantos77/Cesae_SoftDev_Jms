package Ficha_06;


import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String changeNumber = null;
        int operation;

        System.out.print("Introduza um número para analisar: ");
        int number = input.nextInt();

        do {
            System.out.print("\nEscolha uma Operação ou '7' para sair:\n" +
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
                        System.out.print("\n> É Par.");
                    } else {
                        System.out.print("\n> É Impar.");
                    }
                    break;
                case 2:
                    if (Ex_03.isPositive(number)) {
                        System.out.print("\n> É Positivo.");
                    } else {
                        System.out.print("\n> É Negativo.");
                    }
                    break;
                case 3:
                    if (Ex_03.isPrime(number)) {
                        System.out.print("\n> É Primo.");
                    } else {
                        System.out.println("\n> É Não Primo.");
                    }
                    break;
                case 4:
                    if (Ex_03.isPerfect(number)) {
                        System.out.println("\n> O número é Perfeito.");
                    } else {
                        System.out.println("\n> O número é Não Perfeito.");
                    }
                    break;
                case 5:
                    if (Ex_03.isTriangular(number)) {
                        System.out.print("\n> O número é Triangular.");
                    } else {
                        System.out.print("\n> O número é Não Triangular.");
                    }
                    break;
                case 6:
                    System.out.print("\nIntroduza um novo número para analisar: ");
                    number = input.nextInt();
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }

            System.out.println();

        } while (operation != 7);
    }
}
