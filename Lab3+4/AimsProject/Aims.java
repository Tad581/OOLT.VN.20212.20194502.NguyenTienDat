public class Aims {

	public static void main(String[] args) {
		Orders anOrder = Orders.createOrder();
		MyDate date = new MyDate();
		anOrder.addDate(date);

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

		// anOrder.addDVD(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 124, 24.95f);
		// anOrder.addDVD(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
		// anOrder.addDVD(dvd3);

		DigitalVideoDisc[] dvdList = { dvd1, dvd2, dvd3 };
		anOrder.addDVD(dvdList);

		CompactDisc cd1 = new CompactDisc("Mickey Mouse", "Animation", "Walt Disney", 90, 20.5f);

		CompactDisc cd2 = new CompactDisc("Your Name", "Animation", "Shinkai Matoko", 1, 30.5f);

		CompactDisc cd3 = new CompactDisc("Tranformers", "Science Fiction", "None", 5, 40.95f);

		CompactDisc[] cdList = { cd1, cd2, cd3 };
		anOrder.addCompactDisc(cdList);

		anOrder.printOrders(anOrder);

		System.out.print("Total Cost is: ");
		System.out.println(anOrder.totalCost());

		// anOrder.removeDVD(dvd2);

		// System.out.print("Total Cost after remove is: ");
		// System.out.println(anOrder.totalCost());
	}

}
