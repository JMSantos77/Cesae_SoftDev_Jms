package Ficha_04_Extra_Ciclos;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result;

        System.out.println("\n*** Início do programa Tabuada ***\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
            System.out.println();
        }
    }
}
