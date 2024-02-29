package Ficha_04_Extra_Ciclos;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int largestNumber = 0;
        int lowestNumber = 0;

        System.out.print("Introduza um número: ");
        num = input.nextInt();

        while (num != 0) {

            if (num > largestNumber) {
                largestNumber = num;
            } else if (num < lowestNumber) {
                lowestNumber = num;
            }

            System.out.print("Introduza outro número: ");
            num = input.nextInt();
        }
        System.out.println("O maior número é: " + largestNumber);
        System.out.println("O menor número é: " + lowestNumber);
    }
}
