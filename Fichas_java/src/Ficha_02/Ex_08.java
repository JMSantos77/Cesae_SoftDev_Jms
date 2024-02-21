package Ficha_02;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, pondAverage;

        System.out.println("Introduza o primeiro valor: ");
        nota1 = input.nextDouble();

        System.out.println("Introduza o segundo valor: ");
        nota2 = input.nextDouble();

        System.out.println("Introduza o terceiro valor: ");
        nota3 = input.nextDouble();

        pondAverage = ((nota1 * 0.25) + (nota2 * 0.35) + (nota3 * 0.4));

        if (pondAverage > 9.5) {
            System.out.println("O aluno está aprovado, nota maior que 9.5!");
        } else {
            System.out.println("O aluno está reprovado, nota menor que 9.5!");
        }
    }
}
