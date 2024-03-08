package Ficha_06;

import java.util.Scanner;

public class Ex_03 {
    //a)
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //b)
    static boolean isPositive(int number) {
        return number > 0;
    }

    //c)
    static boolean isPrime(int number) {

        boolean primo = true;

        for (int divisor = 2; divisor < number; divisor++) {

            if (number % divisor == 0) {
                primo = false;
            }
        }

        return primo;
    }

    //e)
    static boolean isTriangular(int number) {

        int sum = 0;
        boolean isPerfect = true;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        if (number == sum) {
            isPerfect = false;
        }

        return isPerfect;
    }


    public static void main(String[] args) {

    }
}
