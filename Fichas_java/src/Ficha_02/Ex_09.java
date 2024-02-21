package Ficha_02;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Introduza um n.º Inteiro:");
        num1 = input.nextInt();

        System.out.println("Introduza outro n.º Inteiro:");
        num2 = input.nextInt();

        System.out.println("Introduza outro n.º Inteiro:");
        num3 = input.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números são todos iguais!");
        } else if (num1 < num2 && num1 < num3) {
            System.out.println("O menor número é: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor número é: " + num2);
        } else {
            System.out.println("O menor número é: " + num3);
        }
    }
}
