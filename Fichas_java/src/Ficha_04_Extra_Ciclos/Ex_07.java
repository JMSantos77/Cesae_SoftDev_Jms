package Ficha_04_Extra_Ciclos;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, positiveSum = 0, negativeSum = 0;

        System.out.print("Introduza um número inteiro (negativo ou positivo): ");
        num = input.nextInt();

        while (num != 0) {
            if (num < 0) {
                negativeSum++;
            } else {
                positiveSum++;
            }
            System.out.print("Introduza outro número inteiro (negativo ou positivo): ");
            num = input.nextInt();
        }
        System.out.println("Introduziu: \n Números negativos: " + negativeSum + "\n Números positivos: " + positiveSum);
    }
}
