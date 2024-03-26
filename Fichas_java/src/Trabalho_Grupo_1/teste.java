package Trabalho_Grupo_1;

import org.w3c.dom.ls.LSOutput;

/**
 * Exemplo de Criar uma excepção com "try...catch".
 */

public class teste {
    public static void main(String[] args) {

        int numbers[] = {4, 8, 16, 32, 64, 120, 236};
        int deno[] = {2, 0, 4, 4, 0, 2};

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println(numbers[i] + "/" + deno[i] + " = " + numbers[i] / deno[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Excep 1: Não se pode dividir por zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                //Pq num tem tamanho maior que deno.
                System.out.println("Excep 2: Não foi encontrado o elemento correspondente!");
            }
        }
        String moneyBag = "\uD83D\uDCB0";
        System.out.println(moneyBag);

    }


}
