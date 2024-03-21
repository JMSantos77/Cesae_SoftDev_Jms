package Trabalho_Grupo_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Teste de usar o PrintWriter.
 */

public class printWriter {
    public static void deleteLineInFile(String lineToDelete) throws FileNotFoundException {
        String path = "Fichas_java/Files_Ficha_07/printwriterTeste.csv";
        File file = new File(path);
        Scanner readFile = new Scanner(file);
        PrintWriter printWriter = new PrintWriter("Fichas_java/Files_Ficha_07/printwriterTeste2.csv");
        String line;

        while (readFile.hasNextLine()){
            line = readFile.nextLine();
            if (lineToDelete == line){
                //line = "";
                line.replaceAll(line, "");
                printWriter.println(line);
            }else{
                printWriter.println(line);
            }
        }
/*
        if (lineToDelete == readFile.nextLine()){
            String line = readFile.nextLine();
            line.replaceAll(line, "");
        }
 */
        printWriter.close();

    }

    public static void writeToFile() throws FileNotFoundException {
        String path = "Fichas_java/Files_Ficha_07/printwriterTeste.csv";
        String edit = "Bla Bla Bla!";

        //File testeEscrita = new File("C:/Users\\softdev\\Documents\\GitHub\\Cesae_SoftDev_Jms\\Fichas_java\\src\\Trabalho_Grupo_1\\testeEscrita.txt");
        File testeEscrita = new File("Fichas_java/Files_Ficha_07/printwriterTeste.csv");

        PrintWriter printWriter = new PrintWriter(testeEscrita);

        printWriter.println(edit); // Passo o texto como argumento.
        printWriter.println("Linha 1"); // Passo o texto directamente.
        printWriter.println("Linha 2");
        printWriter.println("Linha 3");
        printWriter.println("Linha 4");
        printWriter.println("Linha 5");

        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        //writeToFile();

        String line = "Linha 3";
        deleteLineInFile(line);
    }
}
