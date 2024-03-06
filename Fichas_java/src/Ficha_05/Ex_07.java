package Ficha_05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers[] = new int[10], insert;
        //int evenNumbers[] = new int [];
        int highestEven = -1;
        String onlyOddNumbers = "Não existem números pares";

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um número no array: ");
            insert = input.nextInt();
            numbers[i] = insert;
        }

        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > highestEven) {
                highestEven = numbers[i];
            }
        }
        /*
        if (insert % 2 == 0 && insert > highestEven) {
            evenNumbers[i] = insert;
            highestEven = insert;
        }

         */

        if (highestEven % 2 == 0 && highestEven != 0) {
            System.out.println("\nO maior número par do array é: " + highestEven);
        } else {
            System.out.println("\n" + onlyOddNumbers);
        }

    }
}
