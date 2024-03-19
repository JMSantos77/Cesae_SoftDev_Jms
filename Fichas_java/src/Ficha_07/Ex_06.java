package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
 * imprima o nome da pessoa mais velha na consola.
 */

public class Ex_06 {
    public static void printOldestPerson(String path) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File(path));

        String line, oldestPerson = "";
        double age, higherAge = 0;

        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            String[] lineVector = line.split(",");
            age = Integer.parseInt(lineVector[1]);

            if (age > higherAge) {
                higherAge = age;
                oldestPerson = lineVector[0]; // Pq lineVector[0] = é uma String
            }
        }
        System.out.println("A pessoa mais velha é: " + oldestPerson + " com a idade: " + higherAge);
    }

    public static void main(String[] args) {
        try {
            printOldestPerson("Cesae_SoftDev_Jms/Fichas_java/Files_Ficha_07/exercicio_06.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de texto não encontrado...");
        }

    }
}
