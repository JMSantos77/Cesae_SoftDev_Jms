package Ficha_01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma, sub, multi, div;

        System.out.println("Insira um  n.º inteiro:");
        num1 = input.nextInt();

        System.out.println("Insira outro n.º Inteiro:");
        num2 = input.nextInt();

        soma = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + multi);
        System.out.println("Divisão: " + div);


        /*
        Outra abordagem seria criar uma só var que seria reaproveitada.

        resultado = num1 + num2
        System.out.println("Soma: " + resultado);
        resultado = num1 - num2
        System.out.println("Subtração: " + resultado);
        ...
         */
    }
}
