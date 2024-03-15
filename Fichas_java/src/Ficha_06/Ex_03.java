package Ficha_06;

public class Ex_03 {
    //a) isEven
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //b)  isPositive
    public static boolean isPositive(int number) {
        return number > 0;
    }

    //c) isPrime
    public static boolean isPrime(int number) {

        boolean primo = true;

        for (int divisor = 2; divisor < number; divisor++) {

            if (number % divisor == 0) {
                primo = false;
            }
        }

        return primo;
    }

    //d) isPerfect
    public static boolean isPerfect(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return number == sum;
    }

    //e) isTriangular
    public static boolean isTriangular(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
            if (sum == number) {
                break;
            }
        }

        return number == sum;
    }
}
