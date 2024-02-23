package Ficha_02_Extra;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double productPrice, priceWithDiscount;

        System.out.println("\n*** Início do programa Verificação do desconto do Produto ***");
        System.out.println("Insira o valor do produto: ");
        productPrice = input.nextInt();

        if (productPrice > 100) {
            priceWithDiscount = productPrice * 0.9;
            System.out.println("Preço Final: " + priceWithDiscount + "€");
        } else {
            priceWithDiscount = productPrice;
            System.out.println("Preço Final: " + priceWithDiscount + "€");
        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
