package Ficha_05;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        int numbers[] = {45, 5, -11, 87, 9, -3, 95, -12, 23, 10};
        int lowestNumber = numbers[0];

        for (int i = 0; i < 10; i++) {
            if (numbers[i] < lowestNumber) {
                lowestNumber = numbers[i];
            }
        }

        System.out.println("O menor número do array é: " + lowestNumber);
    }
}
