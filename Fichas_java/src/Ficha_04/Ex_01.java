package Ficha_04;

import java.util.Objects;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        String operation, repeat;

        do {
            System.out.print("Introduza um número: ");
            num1 = input.nextDouble();

            System.out.print("Introduza outro número: ");
            num2 = input.nextDouble();

            System.out.print("Introduza uma operação (+, -, *, /): ");
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
            }

            System.out.print("\nDeseja efectuar novos cálculos? Introduza (s/n): ");
            repeat = input.next();

        } while (Objects.equals(repeat, "s"));
    }
}
