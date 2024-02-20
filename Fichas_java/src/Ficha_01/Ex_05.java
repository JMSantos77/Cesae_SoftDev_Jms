package Ficha_01;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3, average, pondAverage;

        System.out.println("Introduza o primeiro valor: ");
        num1 = input.nextDouble();

        System.out.println("Introduza o segundo valor: ");
        num2 = input.nextDouble();

        System.out.println("Introduza o terceiro valor: ");
        num3 = input.nextDouble();

        average = (num1 + num2 + num3) / 3;

        pondAverage = ((num1 * 0.2) + (num2 * 0.3) + (num3 * 0.5));

        System.out.println("a média é: " + average);
        System.out.println("A média ponderada é: " + pondAverage);
    }
}
