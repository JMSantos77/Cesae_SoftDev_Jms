package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 1) Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima na consola.
 */

public class Ex_01 {
    /**
     * Lê o conteúdo de um ficheiro de texto e imprime na consola.
     * @param path
     * @throws FileNotFoundException
     */
    public static void readFileAndPrint(String path) throws FileNotFoundException {

        Scanner readFile = new Scanner(new File(path));

        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        try {
            readFileAndPrint("Fichas_java/Files_Ficha_07/exercicio_01_Alternativa02.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de texto não encontrado...");
        }
    }
}
