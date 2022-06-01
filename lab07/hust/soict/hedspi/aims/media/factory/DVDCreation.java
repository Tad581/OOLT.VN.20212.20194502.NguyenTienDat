package media.factory;

import java.util.Scanner;

import disc.DigitalVideoDisc;
import media.Media;

public class DVDCreation implements MediaCreation {

    @Override
    public Media createMediaFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Media title: ");
        String title = sc.nextLine();
        System.out.println("Media category: ");
        String category = sc.nextLine();
        System.out.println("Media cost: ");
        float cost = Float.parseFloat(sc.nextLine());
        System.out.println("Media director: ");
        String director = sc.nextLine();
        System.out.println("Media length: ");
        int length = sc.nextInt();
        sc.close();
        return new DigitalVideoDisc(title, category, cost, length, director);
    }
}