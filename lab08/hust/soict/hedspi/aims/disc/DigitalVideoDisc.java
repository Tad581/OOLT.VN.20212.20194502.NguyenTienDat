package disc;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }

    public boolean search(String title) {
        for (String word : title.toLowerCase().split("\\s+")) {
            if (this.getTitle().toLowerCase().contains(word) == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
