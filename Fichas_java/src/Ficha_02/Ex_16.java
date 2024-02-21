package Ficha_02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valueInEuros, bills200, bills100, bills50, bills20, bills10, bills5;

        System.out.println("Introduza um montante em €:");
        valueInEuros = input.nextInt();

        bills200 = (valueInEuros / 200) % 10;
        bills100 = (valueInEuros / 100) % 10;
        bills50 = (valueInEuros / 50) % 10;
        bills20 = (valueInEuros / 20) % 10;
        bills10 = (valueInEuros / 10) % 10;
        bills5 = (valueInEuros / 5);

        System.out.println("Notas de 200: " + bills200);
        System.out.println("Notas de 100: " + bills100);
        System.out.println("Notas de 50: " + bills50);
        System.out.println("Notas de 20: " + bills20);
        System.out.println("Notas de 10: " + bills10);
        System.out.println("Notas de 5: " + bills5);
    }
}
