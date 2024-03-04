package Ficha_03;

import java.util.Scanner;

public class Ex_10b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, i = 2;

        System.out.println("Insira um número inteiro maior que 2:");
        num = input.nextInt();

        System.out.println("Os números pares entre 2 e " + num + " são:");

        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
