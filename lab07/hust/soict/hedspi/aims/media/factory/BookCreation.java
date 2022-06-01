package media.factory;
import java.util.Scanner;
import java.util.ArrayList;
import disc.Book;
import media.Media;

public class BookCreation implements MediaCreation{
    public Media createMediaFromConsole(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Media title: ");
        String title = sc.nextLine();
        System.out.println("Media category: ");
        String category = sc.nextLine();
        System.out.println("Media cost: ");
        float cost= Float.parseFloat(sc.nextLine());
        System.out.println("Numbers of authors: ");
        int num = Integer.parseInt(sc.nextLine());
        int i;
        String author;
        ArrayList<String> authors = new ArrayList<String>();
        for(i = 0; i<num; i++){
            System.out.println("Input author:");
            author = sc.nextLine();
            authors.add(author);
        }
        sc.close();
        return new Book(title, category, cost, authors);
    }
}