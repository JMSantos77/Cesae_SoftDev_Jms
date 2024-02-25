package Ficha_03;

import java.util.Scanner;

public class Ex_15_Extra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, factorial = 1;

        System.out.println("Introduza um n.º:");
        num = input.nextInt();

        int tempNum = num;
        while (tempNum > 1) {
            factorial += tempNum;
            tempNum--;
        }

        System.out.println("O factorial é: " + factorial);
    }
}

