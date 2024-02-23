package Ficha_03;

import java.util.Scanner;

public class Ex_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, factorial = 1;

        System.out.println("Introduza um n.º:");
        num = input.nextInt();

        while (num != 0) {
            factorial *= num;
            num = num - 1;
        }
        System.out.println("O factorial é: " + factorial);
    }
}
