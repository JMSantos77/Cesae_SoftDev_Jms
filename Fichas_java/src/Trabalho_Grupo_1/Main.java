package Trabalho_Grupo_1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Apagando a segunda linha (índice 1)
        apagarLinha(matriz, 1);

        // Escrevendo a matriz no arquivo CSV
        escreverCSV(matriz, "matriz.csv");
    }

    public static void apagarLinha(int[][] matriz, int linha) {
        // Verifica se a linha está dentro dos limites da matriz
        if (linha >= 0 && linha < matriz.length) {
            // Substitui todos os elementos da linha pelo valor -1
            for (int j = 0; j < matriz[linha].length; j++) {
                matriz[linha][j] = -1;
            }
        } else {
            System.out.println("Linha fora dos limites da matriz.");
        }
    }

    public static void escreverCSV(int[][] matriz, String arquivo) {
        try (PrintWriter writer = new PrintWriter(new File(arquivo))) {
            // Escreve apenas as linhas que não foram apagadas
            for (int i = 0; i < matriz.length; i++) {
                // Verifica se a linha foi apagada
                if (linhaApagada(matriz[i])) {
                    continue; // Pula a linha apagada
                }
                // Escreve os elementos da linha no arquivo CSV
                for (int j = 0; j < matriz[i].length; j++) {
                    writer.print(matriz[i][j]);
                    if (j < matriz[i].length - 1) {
                        writer.print(",");
                    }
                }
                writer.println();
            }
            System.out.println("Arquivo CSV gerado com sucesso.");
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao criar o arquivo CSV: " + e.getMessage());
        }
    }

    public static boolean linhaApagada(int[] linha) {
        // Verifica se todos os elementos da linha são iguais a -1 (apagados)
        for (int i : linha) {
            if (i != -1) {
                return false; // A linha não está completamente apagada
            }
        }
        return true; // Todos os elementos da linha são -1 (apagados)
    }
}

