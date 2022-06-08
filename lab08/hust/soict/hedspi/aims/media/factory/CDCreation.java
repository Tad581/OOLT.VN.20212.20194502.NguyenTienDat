package media.factory;

import java.util.Scanner;
import java.util.ArrayList;

import disc.CompactDisc;
import disc.Track;
import media.Media;

public class CDCreation implements MediaCreation {
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
        int length = Integer.parseInt(sc.nextLine());
        System.out.println("Media artist: ");
        String artist = sc.nextLine();
        ArrayList<Track> tracks = new ArrayList<Track>();
        System.out.println("Numbers of tracks ");
        int num = Integer.parseInt(sc.nextLine());
        int i = 0;
        for (i = 0; i < num; i++) {
            System.out.println("Input Tracks:");
            String titletrack = sc.nextLine();
            int lengthtrack = Integer.parseInt(sc.nextLine());
            Track track = new Track(titletrack, lengthtrack);
            tracks.add(track);
        }
        sc.close();
        return new CompactDisc(title, category, cost, length, director, artist, tracks);
    }
}