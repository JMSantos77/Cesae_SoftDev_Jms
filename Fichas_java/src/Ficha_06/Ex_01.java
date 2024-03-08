package Ficha_06;

import java.util.Locale;
import java.util.Scanner;

public class Ex_01 {
    public static void animalSounds(String animalType) {

        switch (animalType) {
            case "cão":
                System.out.println("Au au au");
                break;
            case "gato":
                System.out.println("Miau");
                break;
            case "peixe":
                System.out.println("Glub");
                break;
            case "vaca":
                System.out.println("Muuuuu");
                break;
            case "porco":
                System.out.println("Oinc oinc");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha um animal: Cão | Gato | Peixe | Vaca | Porco: ");
        String animalType = input.next().toLowerCase();

        animalSounds(animalType);
    }
}
