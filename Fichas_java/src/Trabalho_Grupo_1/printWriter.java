package Trabalho_Grupo_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Teste de usar o PrintWriter.
 */

public class printWriter {
    public static void main(String[] args) throws FileNotFoundException {

        String edit = "Bla Bla Bla!";

         //File testeEscrita = new File("C:/Users\\softdev\\Documents\\GitHub\\Cesae_SoftDev_Jms\\Fichas_java\\src\\Trabalho_Grupo_1\\testeEscrita.txt");
        File testeEscrita = new File("C:\\Users\\jmcps\\Cesae_SoftDev\\Cesae_SoftDev_Jms\\Fichas_java\\src\\Trabalho_Grupo_1\\testeEscrita.txt");

        PrintWriter printWriter = new PrintWriter(testeEscrita);

        printWriter.println(edit); // Passo o texto como argumento.
        printWriter.println("A seguir ao Bla Bla Bla."); // Passo o texto directamente.
        printWriter.println("E agora 23?");
        printWriter.println("Vai achar o file? Achou!");

        printWriter.close();
    }
}
