package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
 * quantidade vendida, valor unitario) e calcule o valor total das vendas.
 */

public class Ex_08 {

    public static void totalSalesValue(String path) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File(path));

        double salesValue = 0, quant, price;
        String line = readFile.nextLine(); // Inicializa com a linha do cabeçalho.

        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            String[] lineVector = line.split(",");
            salesValue += Double.parseDouble(lineVector[2]) * Double.parseDouble(lineVector[3]);
        }

        System.out.println("O valor total das vendas é: " + salesValue);
    }

    public static void main(String[] args) {
        try {
            totalSalesValue("Cesae_SoftDev_Jms/Fichas_java/Files_Ficha_07/exercicio_08.csv");

        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro de texto não encontrado...");
        }
    }
}
