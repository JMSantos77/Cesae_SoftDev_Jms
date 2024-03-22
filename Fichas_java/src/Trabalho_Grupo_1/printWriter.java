package Trabalho_Grupo_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

/**
 * Teste de usar o PrintWriter.
 */

public class printWriter {

    /**
     * Apaga uma linha passada por parâmetro,
     * passa para um ficheiro temporário e reescreve o original.
     * @param lineToDelete Passa uma string como param para apagar.
     * @throws FileNotFoundException Lança erro caso não ache Ficheiro
     */
    public static void deleteLineInFile(String lineToDelete) throws FileNotFoundException {
        String inputPath = "Fichas_java/Files_Ficha_07/printwriterTeste.csv";
        String writePath = "Fichas_java/Files_Ficha_07/printwriterTeste2.csv";

        File inputFile = new File(inputPath); // Devo fazer isto para converter o caminho que é uma string em File.
        File writeFile = new File(writePath);

        Scanner readFile = new Scanner(inputFile);
        PrintWriter printWriter = new PrintWriter(writeFile);
        String line;

        //Opção a) em que substituo a linha por um espaço em branco
        /*
        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            if (Objects.equals(lineToDelete, line)) {
                line = "";
                //line = line.replaceAll(line, ""); //Outra opção.
                printWriter.print(line); // Assim, como não uso println, não dá uma linha, imprime em branco e o seguinte ocupa o espaço em branco. Senão ficava um espaço em branco.
            } else {
                printWriter.println(line);
            }
        }
         */
        //Opção b) em que não imprimo essa linha, passando-a à frente, eliminando-a dessa forma.
        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            if (!Objects.equals(line, lineToDelete)) {
                printWriter.println(line);
            }
        }
        printWriter.close();
        readFile.close();

        inputPath = "Fichas_java/Files_Ficha_07/printwriterTeste2.csv";
        writePath = "Fichas_java/Files_Ficha_07/printwriterTeste.csv";

        inputFile = new File(inputPath); // Devo fazer isto para converter o caminho que é uma string em File.
        writeFile = new File(writePath);

        readFile = new Scanner(inputFile);
        printWriter = new PrintWriter(writeFile);

        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            printWriter.println(line);
        }
        printWriter.close();
        readFile.close();
    }

    public static void writeToFile() throws FileNotFoundException {
        String path = "Fichas_java/Files_Ficha_07/printwriterTeste.csv";
        String edit = "Bla Bla Bla!";

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

    /**
     * Conta linhas de um ficheiro csv / txt.
     * @throws FileNotFoundException
     */
    public static void countLines() throws FileNotFoundException {

        String inputPath = "Fichas_java/Files_Ficha_07/printwriterTeste.csv";
        File inputFile = new File(inputPath);
        Scanner readFile = new Scanner(inputFile);

        int count = 0;

        while (readFile.hasNextLine()) {
            String line = readFile.nextLine();
            if (!line.isBlank()) { //ou .isEmpty > Qq um destes métodos, se tiver uma linha em branco, não a conta.
                count++;
            }
        }
        System.out.println("Número de linhas: " + count);
    }

    public static void main(String[] args) throws FileNotFoundException {

        //writeToFile();

        String line = "Linha 3"; //Linha passada para apagar.
        deleteLineInFile(line);

        //countLines();
    }
}
