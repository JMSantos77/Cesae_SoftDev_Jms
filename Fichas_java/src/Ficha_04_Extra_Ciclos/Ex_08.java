package Ficha_04_Extra_Ciclos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, result = 1;

        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        System.out.print("Introduza uma potência para elevar o número: ");
        num2 = input.nextInt();

        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }

        // Abordagem com Math.pow()
        //result = (int) Math.pow(num1, num2);

        System.out.println(num1 + " elevado a " + num2 + " = " + result);
    }
}
