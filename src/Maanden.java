import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Maanden {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        int month;
        switch (1-12) {
        }PrintStream out = System.out;

        do {
            out.println("Kies een getal tussen 1 en 12 om de te weten hoe deze maand heet, Invoer mag alleen cijfers bevatten:");
           month = keyboard.nextInt();
        } while (month > 12 | month <= 0);

        switch (month) {
            case 1:
                out.println("1 is de maand Januari, frisse start met geweldige voornemens");
                break;
            case 2:
                out.println("2 is de maand Februari, Love is in the air");
                break;
            case 3:
                out.println("3 is de maand Maart, oftewel Lente!");
                break;
            case 4:
                out.println("4 is de maand April, Pasen & Koningsdag (Feest!)");
                break;
            case 5:
                out.println("5 is de maand Mei, verwen je mama maand!");
                break;
            case 6:
                out.println("6 is de maand Juni, Vakantiee!!");
                break;
            case 7:
                out.println("7 is de maand Juli, Vakantiee!!");
                break;
            case 8:
                out.println("8 is de maand Augustus, saaie maand joh.");
                break;
            case 9:
                out.println("9 is de maand September, einde vakantie.. Lekker studeren.. woop woop");
                break;
            case 10:
                out.println("10 is de maand Oktober, Rocktober!!");
                break;
            case 11:
                out.println("11 is de maand November en het is laat je snor Movember staan!!");
                break;
            case 12:
                out.println("12 is de maand December & het is Winter brrr");
                break;
            default:
                out.println();

        }
        }
    }

