package Ficha_06;

public class Ex_05 {
    // Recebe um array de inteiros como parâmetro e retorna o maior valor do array.
    static int highestVectorElement(int[] vector) {
        int highestElement = vector[0];

        for (int i : vector) {
            if (i > highestElement) {
                highestElement = i;
            }
        }
        return highestElement;
    }

    // Recebe um array de inteiros como parâmetro e retorna o menor valor do array.
    static int lowestVectorElement(int[] vector) {
        int lowestElement = vector[0];

        for (int i : vector) {
            if (i < lowestElement) {
                lowestElement = i;
            }
        }
        return lowestElement;
    }

    // Recebe um array de inteiros como parâmetro e retorna se o array está crescente.
    static boolean isCrescent(int[] vector) {
        int previousElement = vector[0];
        boolean isCrescent = true;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > previousElement) {
                previousElement = vector[i];
            } else {
                isCrescent = false;
                break;
            }
        }

        /*
        // Sem criar uma var booleana extra
        for (int i = 1; i < vector.length; i++) {
        if (vector[i] <= previousElement) {
            return false;
        }
        previousElement = vector[i];
    }
    return true;
         */
        return isCrescent;
    }

    public static void main(String[] args) {
        int[] vetor = {2, 3, 4, 9, 10};
        boolean maior = isCrescent(vetor);
        System.out.println(maior);
    }
}
