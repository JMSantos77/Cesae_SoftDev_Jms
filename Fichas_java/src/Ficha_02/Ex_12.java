package Ficha_02;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menuOption;

        System.out.println("Introduza uma opção:\n 1: Criar \n 2:Actualizar \n 3:Eliminar \n 4:Sair");
        menuOption = input.nextInt();

        switch (menuOption) {
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            case 3:
                System.out.println("Opção 3");
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
