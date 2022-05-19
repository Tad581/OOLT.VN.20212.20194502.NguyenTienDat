package order;

import java.lang.Math;
import media.DigitalVideoDisc;
import media.Media;
import utils.MyDate;
import java.util.ArrayList;
import java.util.List;

public class Orders {

	public static final int MAXIMUM_ORDERED_ITEMS = 10;
	public static final int MAXIMUM_ORDERS = 5;

	private static int nbOrders = 0;

	private List<Media> itemsOrdered = new ArrayList<Media>();

	public Orders() {
	}

	public void addMedia(Media media) {
		if (itemsOrdered.size() == MAXIMUM_ORDERED_ITEMS)
			System.out.println("Error! You have reached maximum orders");
		else {
			itemsOrdered.add(media);
			System.out.println("Add media done!");
		}
	}

	public void removeMedia(String mediaTitle) {
		int i;
		for (i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().equals(mediaTitle)) {
				itemsOrdered.remove(i);
			}
		}
	}

	public void removeMedia(int id) {
		if (id >= itemsOrdered.size() || id < 1) {
			System.out.println("Invalid ID");
			return;
		}
		itemsOrdered.remove(id - 1);
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

	public void showListMedia() {
		System.out.println("Show list media:");
		System.out.printf("ID %-20s %-20s\n", "Title", "Category");
		itemsOrdered.forEach(media -> {
			String title = media.getTitle();
			String category = media.getCategory();
			if (category == null) {
				category = "";
			}
			System.out.printf("%d %-20s %-20s\n", media.getId(), media.getTitle(), category);
		});
	}

	public float totalCost() {
		float total = 0;
		int i;
		for (i = 0; i < itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}

}
