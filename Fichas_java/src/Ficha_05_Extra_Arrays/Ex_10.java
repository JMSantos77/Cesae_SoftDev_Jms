package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {11, 12, 11, 13, 14, 15, 16, 13, 17, 18, 14, 19};
        int[] sortedNumbers = new int[12];
        int count = 0;

        for (int i = 0, k=0; i < numbers.length; i++) {
            for (int j = 0+i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count == 1) {
                sortedNumbers[k++] = numbers[i];
            }
            count = 0;
        }

        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " | ");
        }
    }
}
