package Ficha_02;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valueInEuros, bills200, bills100, bills50, bills20, bills10, bills5;

        System.out.print("Introduza um montante em €: ");
        valueInEuros = input.nextInt();

        if (valueInEuros % 5 ==0) { // Valor válido (múltiplo de 5)

            bills200 = valueInEuros / 200;
            valueInEuros = valueInEuros % 200;

            bills100 = valueInEuros / 100;
            valueInEuros = valueInEuros % 100;

            bills50 = valueInEuros / 50;
            valueInEuros = valueInEuros % 50;

            bills20 = valueInEuros / 20;
            valueInEuros = valueInEuros % 20;

            bills10 = valueInEuros / 10;
            valueInEuros = valueInEuros % 10;

            bills5 = valueInEuros / 5;

            System.out.println("Notas de 200: " + bills200);
            System.out.println("Notas de 100: " + bills100);
            System.out.println("Notas de 50: " + bills50);
            System.out.println("Notas de 20: " + bills20);
            System.out.println("Notas de 10: " + bills10);
            System.out.println("Notas de 5: " + bills5);

        } else { // Valor inválido
            System.out.println("Valor inválido... Não temos trocos.");
        }
    }
}
