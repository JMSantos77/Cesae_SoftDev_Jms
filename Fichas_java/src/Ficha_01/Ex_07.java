package Ficha_01;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valProdutoA, valProdutoB, valProdutoC, valorTotal, valorComDesconto;

        System.out.println("Insira valor do Produto A:");
        valProdutoA = input.nextDouble();

        System.out.println("Insira valor do Produto B:");
        valProdutoB = input.nextDouble();

        System.out.println("Insira valor do Produto C:");
        valProdutoC = input.nextDouble();

        valorTotal = valProdutoA + valProdutoB + valProdutoC;

        valorComDesconto = valorTotal - (valorTotal * 0.1);
        //valorComDesconto = valorTotal * 0.9;

        System.out.println("O valor final com desconto é: " + valorComDesconto);
    }
}
