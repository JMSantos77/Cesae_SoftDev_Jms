package Ficha_02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        int numbers[];
        String order;

        System.out.println("Introduza um n.º:");
        num1 = input.nextInt();

        System.out.println("Introduza outro n.º:");
        num2 = input.nextInt();

        System.out.println("Introduza outro n.º:");
        num3 = input.nextInt();

        numbers = new int[]{num1, num2, num3};
        Arrays.sort(numbers);

        System.out.println("Deseja ordenar por ordem crescente(C) ou decrescente(D)?");
        order = input.next();

        switch (order) {
            case "C":
                System.out.println("Os números por ordem crescente são: " + numbers[0] + "," + numbers[1] + "," + numbers[2]);
                break;
            case "D":
                System.out.println("Os números por ordem decrescente são: " + numbers[2] + "," + numbers[1] + "," + numbers[0]);
                break;
            default:
                System.out.println("Introduza uma opção correcta!");
        }
    }
}
