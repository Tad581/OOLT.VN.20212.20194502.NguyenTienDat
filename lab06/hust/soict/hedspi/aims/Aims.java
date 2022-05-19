import order.Orders;
import utils.MyDate;
import media.Book;
import media.DigitalVideoDisc;
import media.Media;

import java.util.Scanner;

public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner inputTitle = new Scanner(System.in);
		Scanner inputCategory = new Scanner(System.in);
		int choice, isOrderCreated = 0;
		Orders order = new Orders();
		// DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King Queen",
		// "Animation", "Roger Allers", 87, 19.95f);

		// DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction",
		// "George Lucas", 124, 24.95f);

		// DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John
		// Musker", 90, 18.99f);

		do {
			showMenu();
			choice = input.nextInt();
			switch (choice) {
				case 0:
					System.out.println("Thank you for ordered...");
					break;
				case 1:
					order = new Orders();
					System.out.println("New order have been created!");
					isOrderCreated = 1;
					break;
				case 2:
					if (isOrderCreated == 0) {
						System.out.println("You must create order first");
						break;
					}
					System.out.println("Enter the title:");
					String title = inputTitle.nextLine();
					System.out.println("Enter the  category you want to add to order");
					String category = inputCategory.nextLine();
					Media item;
					if (category.equals("")) {
						item = new Media(title);
					} else {
						item = new Media(title, category);
					}
					order.addMedia(item);
					break;
				case 3:
					System.out.println("Enter the id:");
					int id = input.nextInt();
					order.removeMedia(id);
					break;
				case 4:
					order.showListMedia();
					break;
				default:
					System.out.println("Invalid choice. Try again!");
					break;
			}

		} while (choice != 0);
	};

}
