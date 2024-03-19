package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
 * calcule a soma desses números.
 */

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
            readFileAndSum("Cesae_SoftDev_Jms/Fichas_java/Files_Ficha_07/exercicio_05_31.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de texto não encontrado...");
        }
    }
}
