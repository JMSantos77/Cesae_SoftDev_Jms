package Ficha_03;

import java.util.Scanner;

public class Ex_11b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int intervalStart = 0, intervalEnd, jump;

        System.out.print("- Introduza um valor número limite: ");
        intervalEnd = input.nextInt();

        System.out.print("- Introduza um valor para o salto: ");
        jump = input.nextInt();

        while (intervalStart < intervalEnd) {
            System.out.println(intervalStart);
            intervalStart = intervalStart + jump;
        }
    }
}
