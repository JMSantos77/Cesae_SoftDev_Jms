package Ficha_02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double annualSalary, taxes;

        System.out.println("Introduza o valor total do seu salário anual:");
        annualSalary = input.nextDouble();

        if (annualSalary <= 15000) {
            taxes = annualSalary * 0.2;
            System.out.println("Paga taxa de 20%: " + taxes);
        } else {
            taxes = annualSalary * 0.3;
            System.out.println("Paga taxa de 30%: " + taxes);
        }
    }
}
