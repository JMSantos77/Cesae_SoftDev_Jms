package Ficha_04_Extra_Ciclos;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiplesOf3;

        for (int i = 1; i <= 255; i++) {
            multiplesOf3 = i * 3;
            System.out.println(multiplesOf3);
        }
    }
}
