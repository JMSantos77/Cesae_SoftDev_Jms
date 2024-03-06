package Ficha_05;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {

        int numbers[] = {45, 5, -11, 87, 9, 99, 95, -3, 23, 10};
        int highestNumber = numbers[0];

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > highestNumber) {
                highestNumber = numbers[i];
            }
        }

        System.out.println("O maior número do array é: " + highestNumber);

    }
}
