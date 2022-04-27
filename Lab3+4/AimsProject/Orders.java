public class Orders {

	public static final int MAXIMUM_ORDERED_ITEMS = 10;
	public static final int MAXIMUM_ORDERS = 5;

	private static int nbOrders = 0;

	// public static final int MAX_NUMBERS_ORDERED = 10;

	private DigitalVideoDisc itemDigitalVideoDiscs[] = new DigitalVideoDisc[MAXIMUM_ORDERED_ITEMS];
	private CompactDisc itemCompactDisc[] = new CompactDisc[MAXIMUM_ORDERED_ITEMS];
	private int qtyDVD = 0;
	private int qtyCD = 0;

	private MyDate date = new MyDate();

	private Orders() {

	}

	public static Orders createOrder() {
		if (nbOrders >= MAXIMUM_ORDERS) {
			System.out.println("Error! You have reached maximum orders");
			return null;
		} else {
			nbOrders++;
			return new Orders();
		}
	}

	public void addDVD(DigitalVideoDisc[] dvdList) {
		int i;
		if (dvdList.length > MAXIMUM_ORDERED_ITEMS) {
			System.out.println("Error! You have too much DVD in your DVD list");
		} else {
			for (i = 0; i < dvdList.length; i++) {
				itemDigitalVideoDiscs[qtyDVD] = dvdList[i];
				qtyDVD++;
			}
		}
	}

	public void addDVD(DigitalVideoDisc d1, DigitalVideoDisc d2) {
		if (qtyDVD >= MAXIMUM_ORDERED_ITEMS) {
			System.out.println("Error! You have too much DVD in your DVD list");
		} else {
			itemDigitalVideoDiscs[qtyDVD] = d1;
			qtyDVD++;
			if (qtyDVD >= MAXIMUM_ORDERED_ITEMS) {
				System.out.println("Error! You have too much DVD in your DVD list");
			} else {
				itemDigitalVideoDiscs[qtyDVD] = d2;
			}
		}
	}

	public void addDVD(DigitalVideoDisc d) {
		itemDigitalVideoDiscs[qtyDVD] = d;
		qtyDVD++;
		if (qtyDVD > MAXIMUM_ORDERED_ITEMS) {
			System.out.print("Your list is full");
		}
	}

	public void removeDVD(DigitalVideoDisc d) {
		int i, j;
		qtyDVD--;
		for (i = 0; i < qtyDVD; i++) {
			if (itemDigitalVideoDiscs[i] == d) {
				for (j = i; j < qtyDVD - 1; j++) {
					itemDigitalVideoDiscs[j] = itemDigitalVideoDiscs[j + 1];
				}
				itemDigitalVideoDiscs[qtyDVD - 1] = null;
				break;
			}
		}
	}

	public float totalCost() {
		int i;
		float total = 0;

		for (i = 0; i < qtyDVD; i++) {
			total += itemDigitalVideoDiscs[i].getCost();
		}

		for (i = 0; i < qtyCD; i++) {
			total += itemCompactDisc[i].getCost();
		}
		return total;
	}

	public void addCompactDisc(CompactDisc c) {
		itemCompactDisc[qtyDVD] = c;
		qtyCD++;
		if (qtyCD > MAXIMUM_ORDERED_ITEMS) {
			System.out.print("Your list is full");
		}
	}

	public void addCompactDisc(CompactDisc[] cdList) {
		int i;
		if (cdList.length > MAXIMUM_ORDERED_ITEMS) {
			System.out.println("Error! You have too much DVD in your DVD list");
		} else {
			for (i = 0; i < cdList.length; i++) {
				itemCompactDisc[qtyCD] = cdList[i];
				qtyCD++;
			}
		}
	}

	public void addCompactDisc(CompactDisc c1, CompactDisc c2) {
		if (qtyCD >= MAXIMUM_ORDERED_ITEMS) {
			System.out.println("Error! You have too much CD in your CD list");
		} else {
			itemCompactDisc[qtyCD] = c1;
			qtyCD++;
			if (qtyCD >= MAXIMUM_ORDERED_ITEMS) {
				System.out.println("Error! You have too much CD in your CD list");
			} else {
				itemCompactDisc[qtyCD] = c2;
			}
		}
	}

	public void removeCompactDisc(CompactDisc c) {
		int i, j;
		qtyCD--;
		for (i = 0; i < qtyCD; i++) {
			if (itemCompactDisc[i] == c) {
				for (j = i; j < qtyCD - 1; j++) {
					itemCompactDisc[j] = itemCompactDisc[j + 1];
				}
				itemCompactDisc[qtyCD - 1] = null;
				break;
			}
		}
	}

	public void addDate(MyDate d) {
		date = d;
	}

	public void printOrders(Orders o) {
		System.out.println("**************************Order**************************");
		System.out.println("Order " + nbOrders);
		System.out.print("Date: ");
		date.printDate(date);
		System.out.println("Ordered items: ");
		int i;
		for (i = 0; i < qtyDVD; i++) {
			System.out.println("DVD - " + itemDigitalVideoDiscs[i].getTitle() + " - " + itemDigitalVideoDiscs[i].getCategory() + " - " + itemDigitalVideoDiscs[i].getDirector() + " - " + itemDigitalVideoDiscs[i].getLength() + ": " + itemDigitalVideoDiscs[i].getCost() + "$");
		}
		for (i = 0; i < qtyCD; i++) {
			System.out.println("CD - " + itemCompactDisc[i].getTitle() + " - " + itemCompactDisc[i].getCategory() + " - " + itemCompactDisc[i].getDirector() + " - " + itemCompactDisc[i].getLength() + ": " + itemCompactDisc[i].getCost() + "$");
		}
		System.out.println("*********************************************************");
	}

}
