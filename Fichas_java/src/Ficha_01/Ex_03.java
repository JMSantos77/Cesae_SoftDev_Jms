package Ficha_01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, altura, perimetro, area;

        System.out.println("Introduza o tamanho da base: ");
        base = input.nextDouble();

        System.out.println("Introduza o tamanho da altura: ");
        altura = input.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("O perimetro é: " + perimetro);
        System.out.println("A área é: " + area);
    }
}
