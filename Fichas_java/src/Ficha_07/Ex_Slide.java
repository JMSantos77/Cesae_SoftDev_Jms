package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_Slide {
    //Exemplo do slide 19 - Ficheiros
    public static void usingPrintWriter() throws FileNotFoundException {
        String fileContent = "Hello! Adoro programar em Java!";

        File file = new File("Fichas_java/Files_Ficha_07/fileToWrite.txt");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(fileContent);
        printWriter.println("É a minha UFCD Favorita!");

        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        usingPrintWriter();

/*
    // Exemplo do pdf 20 slide String.split( )
        String linha = "1 frutas laranja 1.5 1.3";

        String[] items = linha.split(" ");
        //Tem de ter um espaço "_" para ele separar cada palavra qd encontra um espaço,
        // senão separa cada char numa posição do array.

        for (String i : items) {
            System.out.print(i + " | ");
        }

 */
    }
}
