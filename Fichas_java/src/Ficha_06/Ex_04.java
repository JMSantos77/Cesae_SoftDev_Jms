package Ficha_06;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número para analisar: ");
        int number = input.nextInt();

        System.out.print("Escolha uma Operação: ");
        int operation = input.nextInt();


        switch (operation) {
            case 1:
                if (Ex_03.isEven(number)) {
                    System.out.print("É par.");
                } else {
                    System.out.print("É impar.");
                }
                break;
            case 2:
                if (Ex_03.isPositive(number)) {
                    System.out.print("É positivo.");
                } else {
                    System.out.print("É negativo.");
                }
            case 3:
                if (Ex_03.isPrime(number)) {
                    System.out.print("É primo.");
                } else {
                    System.out.println("Não é primo.");
                }
            case 5:
                if (Ex_03.isTriangular(number)) {
                    System.out.print("O número é perfeito.");
                } else {
                    System.out.print("O número não é perfeito.");
                }
        }
    }
}
