package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Ex_09 {
    public static String[][] readFileToMatrix(String path) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File(path));

        int numberLines = 0, numberColumns = 0;

        String line = readFile.nextLine(); // Lê o cabeçalho 1º, para que não conte a seguir
        //String [][] musicListMatrix = null;

        // Descobrir n.º de linhas e colunas da matriz.
        while (readFile.hasNextLine()) {
            numberLines++;
            String[] lineVector = readFile.nextLine().split(",");
            numberColumns = lineVector.length;
        }

        String[][] musicListMatrix = new String[numberLines][numberColumns]; // Inicializa a matriz com o tamanho correto.

        // Reabre o arquivo para voltar ao início
        readFile = new Scanner(new File(path));
        String line2 = readFile.nextLine(); // Lê o cabeçalho 1º, para que não seja inserido

        int lines = 0, column = 0;
        while (readFile.hasNextLine()) {
            String[] lineVector = readFile.nextLine().split(",");
            for (String element : lineVector) {
                musicListMatrix[lines][column] = element;
                column++;
            }
            lines++;
            column = 0; //Reinicia a coluna para a próxima linha.
        }
        /*
        for (int i = 0; i < musicListMatrix.length; i++) {
            for (int j = 0; j < musicListMatrix[i].length; j++) {
                System.out.print(musicListMatrix[i][j] + " | ");
            }
            System.out.println();
        }
        */
        return musicListMatrix;
    }

    public static void searchMusicByGenre() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        int musicGenre;
        String path = "Fichas_java/Files_Ficha_07/exercicio_09.csv";

        System.out.print("\nQue estilo de música pretende pesquisar?: \n" +
                "1. Rock\n" +
                "2. Pop\n" +
                "3. Rock and Roll\n" +
                "4. Alternative Rock\n" +
                "5. Grunge\n" +
                "6. Heavy metal\n" +
                "7. Folk\n" +
                "8. Psychedelic Rock\n" +
                "Opção: ");
        musicGenre = input.nextInt();

        printMusicsByGenre(musicGenre, readFileToMatrix(path));
    }

    public static void printMusicsByGenre(int musicGenre, String[][] matrix) {

        String selectedGenre = null;

        switch (musicGenre) {
            case 1:
                selectedGenre = "Rock";
                break;
            case 2:
                selectedGenre = "Pop";
                break;
            case 3:
                selectedGenre = "Rock and Roll";
                break;
            case 4:
                selectedGenre = "Alternative Rock";
                break;
            case 5:
                selectedGenre = "Grunge";
                break;
            case 6:
                selectedGenre = "Heavy Metal";
                break;
            case 7:
                selectedGenre = "Folk";
                break;
            case 8:
                selectedGenre = "Psychedelic Rock";
                break;
        }

        System.out.println("\nAs músicas desse género são:");
        for (int i = 0; i < matrix.length; i++) {
            if (Objects.equals(matrix[i][2], selectedGenre)) {
                System.out.println("> " + matrix[i][0]);
            }
        }
    }

    public static void printMusicsByArtist(String[][] matrix) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int newArraySize = 0;
        String artistName;

        String[] artistsVector = new String[46];
        for (String[] strings : matrix) {
            artistsVector[count] = strings[1];
            count++;
        }

        //Acha o tamanho do novo array.
        for (int i = 0; i < artistsVector.length; i++) {
            for (int j = 0 + i; j < artistsVector.length; j++) {
                if (Objects.equals(artistsVector[i], artistsVector[j])) {
                    count++;
                }
            }
            if (count == 1) {
                newArraySize++;
            }
            count = 0;
        }

        String[] sortedArtists = new String[newArraySize];

        //Envia os não duplicados para o novo array.
        for (int i = 0, k = 0; i < artistsVector.length; i++) {
            for (int j = 0 + i; j < artistsVector.length; j++) {
                if (Objects.equals(artistsVector[i], artistsVector[j])) {
                    count++;
                }
            }
            if (count == 1) {
                sortedArtists[k++] = artistsVector[i];
            }
            count = 0;
        }
        System.out.println("\nEstes são os artistas em arquivo:");
        int count1 = 0;
        for (String artist : sortedArtists) {
            System.out.print(artist + " | ");
            count1++;
            if (count1 == 7) {
                System.out.println();
                count1 = 0;
            }
        }
        System.out.println();
/*
        count = 0;
        System.out.println("\nEstes são os artistas em arquivo:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][1] + " | ");
            count++;
            if (count == 7) {
                System.out.println();
                count = 0;
            }
        }

 */

        System.out.print("\nEscolha um artista para ver as músicas: ");
        artistName = input.nextLine(); // Tem de ser nextLine() para ele ler nome com espaços.

        System.out.println("\nAs músicas deste artista são:");
        for (int i = 0; i < matrix.length; i++) {
            if (Objects.equals(matrix[i][1], artistName)) {
                System.out.println("> " + matrix[i][0]);
            }
        }
    }

    public static void biggestMusic(String[][] matrix) {

        int biggestMusic = 0, totalDuration;
        String biggestSongName = null;

        for (int i = 0; i < matrix.length; i++) {

            String[] time = matrix[i][3].split(":");

            int minutes = Integer.parseInt(time[0]) * 60;
            int seconds = Integer.parseInt(time[1]);
            totalDuration = minutes + seconds;

            if (totalDuration > biggestMusic) {
                biggestMusic = totalDuration;
                biggestSongName = matrix[i][0];
            }
        }

        System.out.println("\nA música com maior duração é: " + biggestSongName);
    }

    public static void sortMusicsByTime(String[][] matrix) {
        Scanner input = new Scanner(System.in);

        int searchByTime;

        System.out.print("\nInsira um valor em minutos: ");
        searchByTime = input.nextInt() * 60;

        int biggestMusic = 0, totalDuration;

        System.out.println("\n** Músicas superiores a " + searchByTime / 60 + " minutos **");
        for (int i = 0; i < matrix.length; i++) {

            String[] time = matrix[i][3].split(":");

            int minutes = Integer.parseInt(time[0]) * 60;
            int seconds = Integer.parseInt(time[1]);
            totalDuration = minutes + seconds;

            if (totalDuration > searchByTime) {
                System.out.println("> " + matrix[i][0]);
            }
        }
    }

    public static void totalFileSongs(String[][] matrix) {
        System.out.println("\nO total de músicas no ficheiro é: " + matrix.length);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        String path = "Fichas_java/Files_Ficha_07/exercicio_09.csv";
        int option;

        System.out.println("\n*** BEM VINDO AO PROGRAMA 'LISTA DE MÚSICAS' ***");

        do {

            System.out.print("\nInsira uma opção:\n" +
                    "1. Pesquisar músicas por género.\n" +
                    "2. Pesquisar músicas por artista.\n" +
                    "3. Pesquisar música com maior duração.\n" +
                    "4. Pesquisar músicas com duração acima de um valor especificado.\n" +
                    "5. Número de músicas no ficheiro.\n" +
                    "6. Sair.\n" +
                    "Opção: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    searchMusicByGenre();
                    break;
                case 2:
                    printMusicsByArtist(readFileToMatrix(path));
                    break;
                case 3:
                    biggestMusic(readFileToMatrix(path));
                    break;
                case 4:
                    sortMusicsByTime(readFileToMatrix(path));
                    break;
                case 5:
                    totalFileSongs(readFileToMatrix(path));
                    break;
                case 6:
                    System.out.println("\nAté à próxima! :-)");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        } while (option != 6);
    }
}
