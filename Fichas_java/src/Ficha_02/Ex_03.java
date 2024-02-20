package Ficha_02;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double annualSalary, taxes;

        System.out.println("Insert your annual salary:");
        annualSalary = input.nextDouble();

        if (annualSalary <= 15000) {
            taxes = annualSalary * 0.2;
        } else if (annualSalary <= 20000) {
            taxes = annualSalary * 0.3;
        } else if (annualSalary <= 25000) {
            taxes = annualSalary * 0.35;
        } else {
            taxes = annualSalary * 0.4;
        }

        System.out.println("O valor de impostos pagos é de: " + taxes);
    }
}
