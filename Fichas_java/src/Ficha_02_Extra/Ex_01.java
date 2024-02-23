package Ficha_02_Extra;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;

        System.out.println("\n*** Início do programa Verificação de Idade ***");
        System.out.println("Insira a sua idade: ");
        age = input.nextInt();

        if (age <= 18) {
            System.out.println("Menor de idade.");
        } else {
            System.out.println("Maior de Idade.");
        }
        System.out.println("\n*** Fim do Programa ***");
    }
}
