package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbersArray = new int[10];
        int search;
        boolean exists = false;

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("Insira um número no array: ");
            numbersArray[i] = input.nextInt();
        }

        System.out.println("\nEscolha um número para pesquisar: ");
        search = input.nextInt();

        for (int j = 0; j < numbersArray.length; j++) {
            if (numbersArray[j] == search) {
                exists = true;
                System.out.println(search + " aparece na posição Array[" + j + "]");
            }
        }

        if (exists) {
            System.out.println(search + " existe no Array.");
        } else {
            System.out.println(search + " Não existe no Array.");
        }
    }
}
