package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex_09 {
    public static void readFileToMatrix(String path) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File(path));

        int mLine = 0, mColumn = 0;
        String line = readFile.nextLine();
        //String [][] musicListMatrix = new String[][];

        while (readFile.hasNextLine()) {
            line = readFile.nextLine();
            String[] lineVector = line.split(",");

            for (String i : lineVector) {
                //String [mLine][mColumn] musicListMatrix  = i;
                mColumn++;
            }
            mLine++;
        }


    }

    public static void main(String[] args) {

    }
}
