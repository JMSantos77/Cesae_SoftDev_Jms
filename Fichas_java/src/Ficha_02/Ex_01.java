package Ficha_02;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("insira um n.º inteiro");
        num1 = input.nextInt();

        System.out.println("insira outro n.º inteiro");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Maior: " + num1);
        } else if (num1 < num2) {
            System.out.println("Maior: " + num2);
        } else {
            System.out.println("Os n.ºs são iguais!");
        }
    }
}
