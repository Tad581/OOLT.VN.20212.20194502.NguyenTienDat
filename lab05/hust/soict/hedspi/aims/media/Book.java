package media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(String title) {
        super(title);
    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title, String category, float cost, List<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (!this.authors.contains(authorName)) {
            this.authors.add(authorName);
            System.out.println("Add success!");
        } else {
            System.out.println("Author already exist!");
            return;
        }
    }

    public void removeAuthor(String authorName) {
        if (this.authors.contains(authorName)) {
            this.authors.remove(authorName);
            System.out.println("Delete success!");
        } else {
            System.out.println("Author does'nt exist!");
            return;
        }
    }

}