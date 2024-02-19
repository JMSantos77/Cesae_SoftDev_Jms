package Ficha_01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int minMusica1, segMusica1, minMusica2, segMusica2, minMusica3, segMusica3, minMusica4, segMusica4, minMusica5, segMusica5, totalDurationInSec, hours, minutes, seconds;

        System.out.println("Introduza minutos da música 1:");
        minMusica1 = input.nextInt();

        System.out.println("Introduza segundos da música 1:");
        segMusica1 = input.nextInt();

        System.out.println("Introduza minutos da música 2:");
        minMusica2 = input.nextInt();

        System.out.println("Introduza segundos da música 2:");
        segMusica2 = input.nextInt();

        System.out.println("Introduza minutos da música 3:");
        minMusica3 = input.nextInt();

        System.out.println("Introduza segundos da música 3:");
        segMusica3 = input.nextInt();

        System.out.println("Introduza minutos da música 4:");
        minMusica4 = input.nextInt();

        System.out.println("Introduza segundos da música 4:");
        segMusica4 = input.nextInt();

        System.out.println("Introduza minutos da música 5:");
        minMusica5 = input.nextInt();

        System.out.println("Introduza segundos da música 5:");
        segMusica5 = input.nextInt();

        totalDurationInSec = ((minMusica1 + minMusica2 + minMusica3 + minMusica4 + minMusica5) * 60 + segMusica1 + segMusica2 + segMusica3 + segMusica4 + segMusica5);

        hours = totalDurationInSec / 3600;
        minutes = (totalDurationInSec % 3600) / 60;
        seconds = totalDurationInSec % 60;

        System.out.println("A duração do álbum é: " + hours+"h:" + minutes+"m:" + seconds+"s");
    }
}
