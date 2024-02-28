package Ficha_04_Extra_Ciclos;

public class Ex_04 {
    public static void main(String[] args) {

        String star = "*", space = " ";

        // 4.1)
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println();
        //4.2)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println();
        //4.3)

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(space);
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(star);
            }
            System.out.println();
        }

    }
}
