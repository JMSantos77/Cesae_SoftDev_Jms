package Ficha_05_Extra_Arrays;

import java.util.Scanner;

public class Ex_10 {
    /**
     * Variações do exercicio
     * Se: i=0 e j=i => Envia todos (envia a última vez que um número aparece) excluindo repetidos. (12 | 11 | 15 | 16 | 13 | 17 | 18 | 14 | 19 | )
     * Se: i=0 e j=0 => Envia só os que não se repetem.
     * Se: i=0 e j=i+1 => Envia apenas os repetidos. (11 | 13 | 14)
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {11, 12, 11, 13, 14, 15, 16, 13, 17, 18, 14, 19};
        int count = 0, newArraySize = 0;

        //Acha o tamanho do novo array.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
                //System.out.println("i=" + numbers[i] + " | j=" + numbers[j] + " count:" + count);
            }
            if (count == 1) {
                newArraySize++;
            }
            count = 0;
        }

        //Instancia um array com o tamanho correto.
        int[] sortedNumbers = new int[newArraySize];

        //Envia os não duplicados para o novo array.
        for (int i = 0, k = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count == 1) {
                sortedNumbers[k++] = numbers[i];
            }
            count = 0;
        }

        //Imprime o novo array.
        for (int i : sortedNumbers) {
            System.out.print(i + " | ");
        }
    }
}