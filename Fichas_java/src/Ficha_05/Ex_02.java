package Ficha_05;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int commission[] = new int[12], commissionValue, commissionSum = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Insira o valor da comissão do mês " + (i + 1) + ": ");
            commissionValue = input.nextInt();
            commission[i] = commissionValue;
            commissionSum += commissionValue;
        }

        System.out.println("\nO valor total anual das comissões é: " + commissionSum + "€");
    }
}
