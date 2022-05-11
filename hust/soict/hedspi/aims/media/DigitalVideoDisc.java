package media;

import javax.print.attribute.standard.Media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

	public DigitalVideoDisc(String title) {
		super(title);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean search(String title) {
		String[] word = title.split("\\s");
		int i;
		for (i = 0; i < word.length; i++) {
			if (!this.title.contains((word[i]))) {
				return false;
			}
		}
		return true;
	}
}
