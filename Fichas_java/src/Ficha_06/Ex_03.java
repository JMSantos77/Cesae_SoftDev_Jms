package Ficha_06;

import java.util.Scanner;

public class Ex_03 {
    //a) isEven
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //b)  isPositive
    static boolean isPositive(int number) {
        return number > 0;
    }

    //c) isPrime
    static boolean isPrime(int number) {

        boolean primo = true;

        for (int divisor = 2; divisor < number; divisor++) {

            if (number % divisor == 0) {
                primo = false;
            }
        }

        return primo;
    }

    //d) isPerfect
    static boolean isPerfect(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return number == sum;
    }

    //e) isTriangular
    static boolean isTriangular(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
            if (sum == number) {
                break;
            }
        }

        return number == sum;
    }


    public static void main(String[] args) {

    }
}
