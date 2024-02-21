package Ficha_02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        int[] numbers;
        String order;

        System.out.println("Introduza um n.º:");
        num1 = input.nextInt();

        System.out.println("Introduza outro n.º:");
        num2 = input.nextInt();

        System.out.println("Introduza outro n.º:");
        num3 = input.nextInt();

        numbers = new int[]{num1, num2, num3};
        Arrays.sort(numbers);

        System.out.println("Deseja ordenar por ordem crescente(c) ou decrescente(d)?");
        order = input.next();

        //Abordagem 1 - Sem Iterador
        switch (order) {
            case "c":
                System.out.println("Os números em ordem crescente são: " + numbers[0] + "," + numbers[1] + "," + numbers[2]);
                break;
            case "d":
                System.out.println("Os números em ordem decrescente são: " + numbers[2] + "," + numbers[1] + "," + numbers[0]);
                break;
            default:
                System.out.println("Introduza uma opção correcta!");
        }
        /*
        //Abordagem 2 - Com Iterador e ciclo for
        switch (order) {
            case "c":
                System.out.println("\nOs números em ordem crescente são:");
                for (int num : numbers) {
                    System.out.println(num);
                }
                break;
            case "d":
                System.out.println("\nOs números em ordem decrescente são:");
                for (int i = 0; i < numbers.length; i++) {
                    int length = numbers.length;
                    System.out.println(numbers[length - i - 1]);
                }
                break;
            default:
                System.out.println("Introduza uma opção correcta!");
        }
        */
    }
}
