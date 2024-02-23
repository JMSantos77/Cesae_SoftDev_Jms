package Ficha_02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double accountBalance, creditOrDebit, finalBalance;

        System.out.println("Introduza o saldo actual da sua conta:");
        accountBalance = input.nextDouble();

        System.out.println("introduza quantia a creditar(valor) ou debitar(-valor):");
        creditOrDebit = input.nextDouble();

        finalBalance = accountBalance + creditOrDebit;

        if (finalBalance < 0) {
            System.out.println("Operação inválida, saldo insuficiente.");
        } else {
            System.out.println("Saldo actual: " + finalBalance);
        }
    }
}
