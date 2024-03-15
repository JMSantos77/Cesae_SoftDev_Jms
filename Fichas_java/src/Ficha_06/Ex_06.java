package Ficha_06;

import java.util.Scanner;

import static Ficha_06.Ex_05.*;

/**
 * Programa Análise de um Vector.
 */

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vectorInput, opcao;

        System.out.print("Qual o tamanho do seu vector?: ");
        int[] vector = new int[input.nextInt()];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("insira um número no vector: ");
            vectorInput = input.nextInt();
            vector[i] = vectorInput;
        }

        do {
            System.out.print("\nEscolha uma Operação:\n" +
                    "7. Maior Elemento\n" +
                    "8. Menor Elemento\n" +
                    "9. Crescente ou não crescente\n" +
                    "10. Sair\n" +
                    "opção: ");

            opcao = input.nextInt();

            switch (opcao) {
                case 7:
                    System.out.println("\n> O maior elemento é: " + highestVectorElement(vector));
                    break;
                case 8:
                    System.out.println("\n> O menor elemento é: " + lowestVectorElement(vector));
                    break;
                case 9:
                    System.out.println("\n> Os elementos são crescentes?: " + isCrescent(vector));
                    break;
                case 10:
                    System.out.println("\nAté à próxima!");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }

        } while (opcao != 10);
    }
}
