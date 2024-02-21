package Ficha_02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        String operation;

        System.out.println("introduza um n.º:");
        num1 = input.nextDouble();

        System.out.println("introduza outro n.º:");
        num2 = input.nextDouble();

        System.out.println("Escolha o tipo de operação: +, -, *, / .");
        operation = input.next();

        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println("O resultado é: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("O resultado é: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("O resultado é: " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("O resultado é: " + result);
                break;
            default:
                System.out.println("Erro! Insira um operador válido!");
        }
    }
}
