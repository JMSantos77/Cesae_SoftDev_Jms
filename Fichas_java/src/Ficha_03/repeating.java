package Ficha_03;

import java.util.Scanner;

public class repeating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i = 2;

        System.out.println("Insira um número inteiro:");
        num = input.nextInt();

        while (i < num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
