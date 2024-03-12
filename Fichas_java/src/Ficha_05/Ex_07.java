package Ficha_05;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers[] = new int[10], insert;
        numbers = new int[]{1, 3, 5, 3, 7, 11, 13, 11, 17, 19};

        //Inserir numeros no array.
        /*
        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um número no array: ");
            insert = input.nextInt();
            numbers[i] = insert;
        }
         */

        int highestEven = -1;

        for (int i : numbers) {
            if (i % 2 == 0) {
                highestEven = i;
                break;
            }
        }
        //System.out.println("maior par achado: " + highestEven);

        if (highestEven == -1) {
            System.out.println("Não existem números pares.");
        } else {
            for (int i = 0; i < 10; i++) {
                if (numbers[i] % 2 == 0 && numbers[i] > highestEven) {
                    highestEven = numbers[i];
                }
            }
            System.out.println("\nO maior número par do array é: " + highestEven);
        }
    }
}
