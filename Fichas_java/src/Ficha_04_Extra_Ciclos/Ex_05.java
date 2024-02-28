package Ficha_04_Extra_Ciclos;

public class Ex_05 {
    public static void main(String[] args) {

        String space = " ";

        //5.1)
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        //5.2)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(space);
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        //5.3)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(space);
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(i - k + 1);

            }
            System.out.println();
        }
    }
}
