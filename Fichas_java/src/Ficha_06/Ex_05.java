package Ficha_06;

public class Ex_05 {
    // Recebe um array de inteiros como parâmetro e retorna o maior valor do array.
    public static int highestVectorElement(int[] vector) {
        int highestElement = vector[0];

        for (int i : vector) {
            if (i > highestElement) {
                highestElement = i;
            }
        }
        return highestElement;
    }

    // Recebe um array de inteiros como parâmetro e retorna o menor valor do array.
    public static int lowestVectorElement(int[] vector) {
        int lowestElement = vector[0];

        for (int i : vector) {
            if (i < lowestElement) {
                lowestElement = i;
            }
        }
        return lowestElement;
    }

    // Recebe um array de inteiros como parâmetro e retorna se o array está crescente.
    public static boolean isCrescent(int[] vector) {

        boolean isCrescent = true;

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < vector[i - 1]) {
                isCrescent = false;
                break;
            }
        }

        return isCrescent;
        /*
        // Sem criar uma var booleana extra
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < vector[i - 1]) {
                return false;
            } else {
                return true;
            }
        }
         */
    }

    public static void main(String[] args) {

    }
}

