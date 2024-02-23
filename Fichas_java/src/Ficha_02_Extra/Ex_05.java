package Ficha_02_Extra;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = 67, inputNumber;

        System.out.println("\n*** Início do programa Jogo do Número Secreto ***");
        System.out.println("Insira um número inteiro entre 1 - 100:");
        inputNumber = input.nextInt();

        if (inputNumber < secretNumber) {
            System.out.println("Muito Baixo!");
            System.out.println("Mais uma tentativa, insira um número:");
            inputNumber = input.nextInt();

            if (inputNumber == secretNumber) {
                System.out.println("Boa! Ganhaste o Jogo!");
            } else {
                System.out.println("Ficaste sem tentativas...");
            }

        } else if (inputNumber > secretNumber) {

            System.out.println("Muito Alto!");
            System.out.println("Mais uma tentativa, insira um número:");
            inputNumber = input.nextInt();

            if (inputNumber == secretNumber) {
                System.out.println("Boa! Ganhaste o Jogo!");
            } else {
                System.out.println("Ficaste sem tentativas...");
            }

        } else {
            System.out.println("Boa! Ganhaste o Jogo!");
        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
