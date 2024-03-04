package Ficha_04_Extra_Ciclos;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, invertedNumber = 0;

        System.out.print("Introduza um número inteiro: ");
        number = input.nextInt();

        while (number != 0) {
            int lastDigit = number % 10;
            invertedNumber = (invertedNumber * 10) + lastDigit;
            number = (int) Math.floor(number / 10);
        }

        System.out.println("O número invertido é: " + invertedNumber);
    }
}
