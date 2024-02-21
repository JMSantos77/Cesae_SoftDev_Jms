package Ficha_02;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double averageBallance, specialCredit;

        System.out.println("introduza o seu saldo médio:");
        averageBallance = input.nextDouble();

        if (averageBallance >= 0 && averageBallance <= 2000) {
            System.out.println("O seu saldo médio é: " + averageBallance + "€ Não tem direito a crédito especial.");
        } else if (averageBallance <= 4000) {
            specialCredit = averageBallance * 0.2;
            System.out.println("O seu saldo médio é: " + averageBallance + "€ O seu crédito especial é: " + specialCredit);
        } else if (averageBallance <= 6000) {
            specialCredit = averageBallance * 0.3;
            System.out.println("O seu saldo médio é: " + averageBallance + "€ O seu crédito especial é: " + specialCredit);
        } else {
            specialCredit = averageBallance * 0.4;
            System.out.println("O seu saldo médio é: " + averageBallance + "€ O seu crédito especial é: " + specialCredit);
        }
    }
}
