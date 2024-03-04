package Ficha_03;

import java.util.Scanner;

public class Ex_13b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int intervalStart, intervalEnd, multiples;

        System.out.print("- Insira o início do intervalo: ");
        intervalStart = input.nextInt();

        System.out.print("- Insira o fim do intervalo: ");
        intervalEnd = input.nextInt();

        System.out.println("\nOs multiplos de 5 são:");

        while (intervalStart <= intervalEnd) {
            if (intervalStart % 5 == 0) {
                System.out.println(intervalStart);
            }
            intervalStart++;
        }
    }
}
