package disc;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks;

    public CompactDisc(String title, String category, float cost, int length, String director, String artist,
            ArrayList<Track> tracks) {
        super(title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return this.artist;
    }

    public void addTrack(Track track) {
        if (this.tracks.contains(track)) {
            System.out.println(track.getTitle() + "is already exist");
            return;
        }
        tracks.add(track);
        System.out.println(track.getTitle() + "was added");
    }

    public void removeTrack(Track track) {
        if (this.tracks.contains(track)) {
            System.out.println(track.getTitle() + "is not exist");
            return;
        }
        tracks.remove(track);
        System.out.println(track.getTitle() + "was removed");
    }

    public int getLength() {
        int sum = 0;
        for (int i = 0; i < tracks.size(); i++) {
            sum += tracks.get(i).getLength();
        }
        return sum;
    }

    @Override
    public void play() {
        for (int i = 0; i < tracks.size(); i++) {
            tracks.get(i).play();
        }
    }

}