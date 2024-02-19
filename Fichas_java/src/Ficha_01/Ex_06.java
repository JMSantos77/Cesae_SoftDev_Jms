package Ficha_01;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2; //store;

        System.out.println("Introduza um n.º inteiro: ");
        num1 = input.nextInt();

        System.out.println("Introduza outro n.º inteiro: ");
        num2 = input.nextInt();

        //store = num1;

        //num1 = num2;

        //num2 = store;

        //System.out.println("num1 agora é = " + num1);

        //System.out.println("num2 agora é = " + num2);

        System.out.println("num1 agora é = " + num2);

        num2 = num1;

        System.out.println("num2 agora é = " + num2);

        System.out.println(num1 + num2);

    }
}
