package Trabalho_Grupo_1;

public class Teste2 {

    /**
     * @method swapMatrix
     * Trocar elementos de uma matriz para outra.
     */
    public static void swapMatrix() {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int newMatrix[][] = new int[4][4];

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                System.out.print(newMatrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    /**
     * @method sortMatrix
     * Ordena uma matriz. Método Bubble sort.
     * @param profitPerGame
     */
    public static void profitAscendingOrder(String[][] profitPerGame) {

        // Criar uma cópia da matriz original para evitar a alteração dos dados originais
        String[][] profitAscendingOrder = new String[profitPerGame.length][2];
        for (int i = 0; i < profitPerGame.length; i++) {
            profitAscendingOrder[i][0] = profitPerGame[i][0];
            profitAscendingOrder[i][1] = profitPerGame[i][1];
        }

        // Bubble sort
        for (int i = 0; i < profitAscendingOrder.length - 1; i++) {
            for (int j = 0; j < profitAscendingOrder.length - i - 1; j++) {
                double currentProfit = Double.parseDouble(profitAscendingOrder[j][1]);
                double nextProfit = Double.parseDouble(profitAscendingOrder[j + 1][1]);
                if (currentProfit > nextProfit) {
                    // Troca de posição dos elementos
                    String[] temp = profitAscendingOrder[j];
                    profitAscendingOrder[j] = profitAscendingOrder[j + 1];
                    profitAscendingOrder[j + 1] = temp;
                }
            }
        }

        // Imprimir a matriz ordenada
        System.out.println("Matriz Ordenada:");
        for (String[] line : profitAscendingOrder) {
            System.out.println(Arrays.toString(line));
        }
    }


    public static void main(String[] args) {
        swapMatrix();
    }
}
