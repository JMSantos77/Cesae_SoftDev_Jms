package Ficha_05;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

        int averageArray[] = {5, 5, 5, 5, 5, 5, 5, 5, 5, 10};
        double sum = 0, count = 0;

        for (int i = 0; i < 10; i++) {
            sum += averageArray[i];
            count++;
        }

        double average = sum / count;

        System.out.println("A média dos números no array é: " + average);
    }
}
