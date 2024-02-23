package Ficha_02_Extra;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double wheight, moonWheight;

        System.out.println("\n*** Início do programa Verificação de Peso na Lua ***");
        System.out.println("Insira o seu peso: ");
        wheight = input.nextInt();

        if (wheight > 0) {
            moonWheight = wheight * 0.84;
            System.out.println("Peso na lua: " + moonWheight + "Kg");
        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
