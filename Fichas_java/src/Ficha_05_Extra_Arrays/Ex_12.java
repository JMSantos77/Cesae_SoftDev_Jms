package Ficha_05_Extra_Arrays;

public class Ex_12 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {9, 10, 11, 12, 13, 14, 15, 16};

        int[] joinArray = new int[16];

        //Enquanto Index < 8 importa do array1, depois importa do array2.
        for (int i = 0, k = 0; i < joinArray.length; i++) {
            if (i < 8) {
                joinArray[i] = array1[i];
            } else {
                joinArray[i] = array2[k];
                k++;
            }
        }

        // Imprime array final.
        for (int i : joinArray) {
            System.out.print(i + " | ");
        }
    }
}
