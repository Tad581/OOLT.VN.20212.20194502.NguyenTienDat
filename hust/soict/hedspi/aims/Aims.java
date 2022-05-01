import order.Orders;
import utils.MyDate;
import disc.CompactDisc;
import disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Orders anOrder = Orders.createOrder();
		MyDate date = new MyDate();
		anOrder.addDate(date);

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King Queen", "Animation", "Roger Allers", 87, 19.95f);

		// anOrder.addDVD(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 124, 24.95f);
		// anOrder.addDVD(dvd2);
		// if (dvd1.search("King")) {
		// 	System.out.println("Yes");
		// } else
		// 	System.out.println("No");

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
		// anOrder.addDVD(dvd3);

		DigitalVideoDisc[] dvdList = { dvd1, dvd2, dvd3 };
		anOrder.addDVD(dvdList);

		CompactDisc cd1 = new CompactDisc("Mickey Mouse", "Animation", "Walt Disney", 90, 20.5f);

		CompactDisc cd2 = new CompactDisc("Your Name", "Animation", "Shinkai Matoko", 1, 30.5f);

		CompactDisc cd3 = new CompactDisc("Tranformers", "Science Fiction", "None", 5, 40.95f);

		CompactDisc[] cdList = { cd1, cd2, cd3 };
		anOrder.addCompactDisc(cdList);

		// anOrder.printOrders();

		// System.out.print("Total Cost is: ");
		// System.out.println(anOrder.totalCost());

		// anOrder.removeDVD(dvd2);

		// System.out.print("Total Cost after remove is: ");
		// System.out.println(anOrder.totalCost());
			
		float luckyPrice = 0;
		for (int i = 0; i < 5; i++) {
			DigitalVideoDisc luckyItem = anOrder.getALuckyItem();
			System.out.println(luckyItem.getTitle());
			luckyPrice += luckyItem.getCost();
		}
		System.out.println("Total price:" + luckyPrice);
	}

}
