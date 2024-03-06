package Ficha_05;

public class Ex_06 {
    public static void main(String[] args) {

        int numbers[] = {1, 5, 15, 20, 5, 30, 35, 40, 45, 50};
        int check = numbers[0];
        boolean ascendingOrder = true;

        for (int i = 1; i < 10; i++) {
            if (numbers[i] > check) {
                check = numbers[i];
            } else {
                ascendingOrder = false;
            }
        }

        System.out.println("Os elementos estão em ordem crescente? > " + ascendingOrder);
    }
}
