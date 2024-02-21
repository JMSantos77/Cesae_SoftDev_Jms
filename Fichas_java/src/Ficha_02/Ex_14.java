package Ficha_02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        int numbers[];

        System.out.println("Introduza um n.º:");
        num1 = input.nextInt();

        System.out.println("Introduza outro n.º:");
        num2 = input.nextInt();

        System.out.println("Introduza outro n.º:");
        num3 = input.nextInt();

        numbers = new int[]{num1, num2, num3};

        Arrays.sort(numbers);

        System.out.println("Os números por ordem crescente são: " + numbers[0] + "," + numbers[1] + "," + numbers[2]);

        /*
        System.out.println("Os números em ordem crescente são:");
        for (int num : numbers) {
            System.out.println(num);
        }
         */
    }
}
