package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_05 {
    public static void readFileAndSum(String path) throws FileNotFoundException {

        Scanner readFile = new Scanner(new File(path));
        int sum = 0;

        while (readFile.hasNextInt()) {
            int num = readFile.nextInt();
            sum += num;
        }

        System.out.println("A soma dos inteiros do ficheiro é: " + sum);
    }

    public static void main(String[] args) {

        try {
            readFileAndSum("Fichas_java/Files_Ficha_07/exercicio_05_31.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de texto não encontrado...");
        }
    }
}
