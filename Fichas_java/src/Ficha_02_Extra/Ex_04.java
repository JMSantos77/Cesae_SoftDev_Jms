package Ficha_02_Extra;

import java.util.Objects;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vowel,
                a = "a", e = "e", i = "i", o = "o", u = "u";

        System.out.println("\n*** Início do programa Verificação de Vogais ou Consoantes ***");
        System.out.println("Insira uma letra em minúsculas:");
        vowel = input.next();

        if (Objects.equals(vowel, a) || Objects.equals(vowel, e) || Objects.equals(vowel, i) || Objects.equals(vowel, o) || Objects.equals(vowel, u)) {
            System.out.println("A letra é uma Vogal.");
        } else {
            System.out.println("A letra é uma Consoante.");
        }

        System.out.println("\n*** Fim do Programa ***");
    }
}
