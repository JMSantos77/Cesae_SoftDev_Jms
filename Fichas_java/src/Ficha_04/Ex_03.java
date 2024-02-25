package Ficha_04;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 67, inputNumber, count = 0;

        System.out.println("\n*** Início do programa Jogo do Número Secreto ***");

        System.out.println("Jogador 1: Insira um número inteiro entre 1 - 100: ");
        inputNumber = input.nextInt();

        do {
            if (inputNumber < secretNumber) {
                count++;
                System.out.println("Muito Baixo!");
                System.out.println("Mais uma tentativa, insira um número:");
                inputNumber = input.nextInt();

            } else if (inputNumber > secretNumber) {
                count++;
                System.out.println("Muito Alto!");
                System.out.println("Mais uma tentativa, insira um número:");
                inputNumber = input.nextInt();
            }
        } while (inputNumber != secretNumber);

        count++;

        System.out.println("\nBoa! Ganhaste o Jogo! Tentativas: " + count);

        System.out.println("\n*** Fim do Programa ***");
    }
}
