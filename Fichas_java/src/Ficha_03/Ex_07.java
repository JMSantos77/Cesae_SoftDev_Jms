package Ficha_03;

public class Ex_07 {
    public static void main(String[] args) {
        System.out.println("\n*** Início do Programa ***");

        int sum = 0;
        /*
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            sum += i;
        }
        */

        //Abordagem com ciclo while.
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            sum += i;
            i++;
        }

        System.out.println("Somatório: " + sum);
    }
}
