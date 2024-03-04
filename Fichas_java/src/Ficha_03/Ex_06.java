package Ficha_03;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("\n*** Início do Programa ***");

        System.out.println("Insira um número inteiro:");
        num1 = input.nextInt();

        System.out.println("Insira outro número inteiro:");
        num2 = input.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }

        //Abordagem com ciclo while
        /*
        while(num1 <= num2){
            System.out.println(num1);
            num1++;
        }
         */
        System.out.println("*** Fim do Programa ***");
    }
}
