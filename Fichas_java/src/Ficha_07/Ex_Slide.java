package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex_Slide {
    //Exemplo do slide 19 - Ficheiros
    public static void usingPrintWriter() throws FileNotFoundException {
        String fileContent = "Hello! Adoro programar em Java!";

        File file = new File("C:/Users/jmcps/Cesae_SoftDev/Cesae_SoftDev_Jms/Fichas_java/src/Ficha_07/fileToWrite.txt");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(fileContent);
        printWriter.println("É a minha UFCD Favorita!");

        printWriter.close();
    }
    public static void main(String[] args) throws FileNotFoundException {

        usingPrintWriter();
    }
}
