package Ficha_04;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;

        do {
            System.out.println("Opção 1 - Criar");
            System.out.println("Opção 2 - Actualizar");
            System.out.println("Opção 3 - Eliminar");
            System.out.println("Opção 4 - Sair");

            System.out.print("Selecione uma opção: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Escolheu a opção 1.\n");
                    break;
                case 2:
                    System.out.println("Escolheu a opção 2.\n");
                    break;
                case 3:
                    System.out.println("Escolheu a opção 3.\n");
                    break;
                default:
                    System.out.println("Insira uma opção válida!\n");
            }
        } while (option != 4);
    }
}
