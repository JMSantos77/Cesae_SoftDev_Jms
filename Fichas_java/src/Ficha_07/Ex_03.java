package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro ficheiro.
 */
public class Ex_03 {
    public static void readFileAndSave(String path) throws FileNotFoundException {

        Scanner readFile = new Scanner(new File(path)); //Carrega o ficheiro a ler.

        File file = new File("Fichas_java/Files_Ficha_07/Exercicio_03_write.txt"); //Cria um novo ficheiro .txt
        PrintWriter printWriter = new PrintWriter(file); //Passo (file) ao PrintWriter como ficheiro onde excrever.
        String line;

        printWriter.println("Início de trasferência do ficheiro:\n");

        while (readFile.hasNextLine()) { //Enquanto houver uma linha executa...
            line = readFile.nextLine(); // line = linha
            printWriter.println(line); // passo a (line) como arg ap printWriter e ele grava no (file).
        }
        printWriter.close(); //Quando while acabar, encerra o PrintWriter
    }

    public static void main(String[] args) {

        try {
            readFileAndSave("Fichas_java/Files_Ficha_07/Exercicio_03.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de texto não encontrado...");
        }
    }
}
