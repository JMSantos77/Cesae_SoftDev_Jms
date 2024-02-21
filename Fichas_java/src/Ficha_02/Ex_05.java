package Ficha_02;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduza um n.º:");
        num1 = input.nextInt();

        System.out.println("Introduza outro n.º:");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num2 + " " + num1);
        } else {
            System.out.println(num1 + " " + num2);
        }
    }
}
