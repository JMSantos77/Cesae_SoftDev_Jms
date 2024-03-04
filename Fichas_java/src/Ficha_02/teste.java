package Ficha_02;

import java.util.Scanner;

public class teste {

    //Ex 16) Outra alternativa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor em euros
        System.out.print("Digite o valor em euros (múltiplo de 5): ");
        int valorEmEuros = scanner.nextInt();

        // Verificar se o valor é múltiplo de 5
        if (valorEmEuros % 5 != 0) {
            System.out.println("O valor deve ser múltiplo de 5.");
            return;
        }

        // Definir as notas disponíveis
        int[] notas = {200, 100, 50, 20, 10, 5};

        // Calcular e exibir a relação de notas necessárias
        System.out.println("Valor lido: " + valorEmEuros + " euros");
        System.out.println("Relação de notas necessárias:");

        for (int nota : notas) {
            //System.out.println(nota + " i");
            int quantidadeNotas = valorEmEuros / nota;
            valorEmEuros %= nota;
            System.out.println(valorEmEuros + "val em € e nota: " +nota);

            if (quantidadeNotas > 0) {
                System.out.println(quantidadeNotas + " nota(s) de " + nota + " euros");
            }
        }

        scanner.close();
    }
}

