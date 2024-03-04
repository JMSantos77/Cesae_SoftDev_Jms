package Ficha_04_Extra_Ciclos;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, digitSum = 0;

        System.out.print("Introduza um número inteiro: ");
        number = input.nextInt();

        while (number != 0) {
            int digit = number % 10; //Dá o último dígito;
            digitSum += digit;
            number = (int) Math.floor(number / 10); //Retira o último dígito;

        }
        System.out.println("O resultado da soma dos dígitos do número é: " + digitSum);
    }
}
