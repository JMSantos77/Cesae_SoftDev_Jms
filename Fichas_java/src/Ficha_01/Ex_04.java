package Ficha_01;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio, area;

        System.out.println("Insira o valor do raio: ");
        raio = input.nextDouble();

        area = 3.1415 * (raio * raio);

        System.out.println("A área da circunferência é: " + area);

    }

}
