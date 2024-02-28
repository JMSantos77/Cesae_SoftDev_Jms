package Ficha_02;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hoursToSec, minutesToSec, totalSec, hours, minutes;

        System.out.println("Introduza as horas:");
        hoursToSec = input.nextInt() * 3600;

        System.out.println("Introduza os minutos:");
        minutesToSec = input.nextInt() * 60;

        totalSec = hoursToSec + minutesToSec;
        hours = totalSec / 3600;
        minutes = (totalSec % 3600) / 60;

        if (totalSec > 0 && totalSec < 43200) { //[0h - 11.59h]
            System.out.println("Horas: " + hours + ":" + minutes + "AM");
        } else if (totalSec >= 43200 && totalSec < 46800) { //[12h - 12.59h]
            hours = 24 - hours;
            System.out.println("Horas: " + hours + ":" + minutes + "PM");
        } else {
            hours = hours - 12;
            System.out.println("Horas: " + hours + ":" + minutes + "PM"); //[13h - 23.59h]
        }
    }
}
