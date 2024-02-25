package Ficha_03;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfEntries, inputNumber, temp = 0;
        String growingOrNot = "Crescente";

        System.out.print("Quantos números deseja inserir?: ");
        numberOfEntries = input.nextInt();

        while (numberOfEntries != 0) {
            System.out.print("Introduza um número: ");
            inputNumber = input.nextInt();

            if (inputNumber < temp) {
                growingOrNot = "Não crescente";
            }

            temp = inputNumber;
            numberOfEntries--;
        }

        System.out.println("A sequência de números é: " + growingOrNot);
    }

    //Abordagem com boolean
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfEntries, inputNumber,
                temp = Integer.MIN_VALUE; // Inicializa com o menor valor possível para garantir que o primeiro número seja sempre maior
        boolean isGrowing = true;

        System.out.print("Quantos números deseja inserir?: ");
        numberOfEntries = input.nextInt();

        while (numberOfEntries != 0) {
            System.out.print("Introduza um número: ");
            inputNumber = input.nextInt();

            if (inputNumber < temp) {
                isGrowing = false;
            }

            temp = inputNumber;
            numberOfEntries--;
        }

        if (isGrowing) {
            System.out.println("A sequência de números é crescente.");
        } else {
            System.out.println("A sequência de números não é crescente.");
        }
    }
     */
}
