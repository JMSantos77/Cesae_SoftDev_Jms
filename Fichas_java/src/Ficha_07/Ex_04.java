package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_04 {
    public static void readCsvFileAndPrint(String path) throws FileNotFoundException {

        Scanner readFile = new Scanner(new File(path));

        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        try {
            readCsvFileAndPrint("Fichas_java/Files_Ficha_07/exercicio_04.csv");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de texto não encontrado...");
        }
    }
}
