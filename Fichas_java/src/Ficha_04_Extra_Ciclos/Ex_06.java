package Ficha_04_Extra_Ciclos;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Introduza um número: ");
        num = input.nextInt();

        int largestNumber = num;
        int lowestNumber = num;


        while (num != 0) {

            if (num > largestNumber) {
                largestNumber = num;
            } else if (num < lowestNumber) {
                lowestNumber = num;
            }

            System.out.print("Introduza outro número (0 para parar): ");
            num = input.nextInt();
        }

        if (largestNumber == lowestNumber) {
            System.out.println("Só foi introduzido um número! Maior = Menor: " + largestNumber);
        } else {
            System.out.println("O maior número é: " + largestNumber);
            System.out.println("O menor número é: " + lowestNumber);
        }
    }
}
