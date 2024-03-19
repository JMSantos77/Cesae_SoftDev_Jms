package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
 * número de palavras presentes nesse ficheiro.
 */

public class Ex_07 {
    public static void printNumberOfLinesAndWords(String path) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File(path));

        String line;
        int numberLines = 0, numberWords = 0;

        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            String[] lineVector = line.split(" ");
            numberLines++;
            numberWords += lineVector.length;
        }

        System.out.println("Número de linhas: " + numberLines + "\nNúmero de palavras: " + numberWords);
    }

    public static void main(String[] args) {

        try {
            printNumberOfLinesAndWords("Cesae_SoftDev_Jms/Fichas_java/Files_Ficha_07/exercicio_07.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de texto não encontrado...");
        }
    }
}
