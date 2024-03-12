package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int[] numbersArray = new int[12];
        int[] numbersArray = {1, 2, 3, 2, 5, 2, 7, 2, 9, 12, 11, 12};

        for (int j = 0; j < numbersArray.length; j++) {
            for (int k = 1 + j; k < numbersArray.length; k++) {
                if (numbersArray[j] == numbersArray[k]) {
                    System.out.println(numbersArray[j]);
                    break;
                }
            }
        }
    }
}
