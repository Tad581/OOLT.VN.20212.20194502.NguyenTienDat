import order.Orders;
import disc.DigitalVideoDisc;
import java.util.Scanner;

public class DiskTest {
    public static void main(String[] args) {
        Orders anOrder = Orders.createOrder();
        Scanner keyboard = new Scanner(System.in);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King Queen", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);

        System.out.println("Input your search key: ");
        String searchKey = keyboard.nextLine();
        keyboard.close();
        int i;

        if (dvd1.search(searchKey)) {
            System.out.println("Yes");
        } else
            System.out.println("No");

        DigitalVideoDisc[] dvdList = { dvd1, dvd2, dvd3 };
        anOrder.addDVD(dvdList);

        float luckyPrice = 0;
        for (i = 0; i < 5; i++) {
            DigitalVideoDisc luckyItem = anOrder.getALuckyItem();
            System.out.println(luckyItem.getTitle());
            luckyPrice += luckyItem.getCost();
        }
        System.out.println("Total price:" + luckyPrice);
    }
}
