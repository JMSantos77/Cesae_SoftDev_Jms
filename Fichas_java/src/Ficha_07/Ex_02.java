package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.
 */

public class Ex_02 {
    public static void createFileAndWriteMessage(String path, String message) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter(new File(path));

        printWriter.println(message);

        printWriter.close();
    }

    public static void main(String[] args) {

        try {
            createFileAndWriteMessage("Fichas_java/Files_Ficha_07/exercicio_02.txt", "Teste de escrever algo, exercício 2.");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de texto não encontrado ou criado...");
        }
    }
}
