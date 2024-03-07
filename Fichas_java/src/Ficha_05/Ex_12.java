package Ficha_05;

public class Ex_12 {
    public static void main(String[] args) {

        int vector1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int vector2[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int matrix[][] = new int[10][2];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = vector1[i];
                matrix[i][1-j] = vector2[i];
                //System.out.print("i: "+ i + " " +matrix[i][j]);
                //System.out.print(" " + matrix[i][1-j]);
            }

        }

        System.out.println("\nEsta é a sua matriz:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
