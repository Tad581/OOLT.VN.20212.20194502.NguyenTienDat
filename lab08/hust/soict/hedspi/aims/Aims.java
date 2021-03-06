import media.*;
import order.*;
import media.factory.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Aims {
	public static void showAdminMenu() {
		System.out.println("Product Management Application:");
		System.out.println("------------------------");
		System.out.println("1. Create new item");
		System.out.println("2. Delete item by id");
		System.out.println("3. Display the items list");
		System.out.println("4. Sort the items list");
		System.out.println("0. Exit");
		System.out.println("-------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

	public static void showUserMenu() {
		System.out.println("Welcome to Aims Store:");
		System.out.println("------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Search for an item from the list by title");
		System.out.println("3. Add item to order by id(id in the list of available items of the store)");
		System.out.println("4. Remove item from order by id (id in the order)");
		System.out.println("5. Display the order information");
		System.out.println("0. Exit");
		System.out.println("-------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}

	public static void showMission() {
		System.out.println("Login:");
		System.out.println("1. Login as Manager:");
		System.out.println("2. Login as Guest:");
		System.out.println("0. Exit:");
		System.out.println("Please choose a number: 0-1-2");
	}

	public static void ItemsMenu() {
		System.out.println("Choose type of item:");
		System.out.println("1. DVD:");
		System.out.println("2. CD:");
		System.out.println("3. Book:");
		System.out.println("Please choose a number: 1-2-3");
	}

	public static Media createMedia(MediaCreation mc) {
		return mc.createMediaFromConsole();
	}

	static Scanner sc = new Scanner(System.in);
	static int ordersNumber = 0;

	public static void main(String[] args) {
		ArrayList<Media> media = new ArrayList<>();
		ArrayList<Orders> oders = new ArrayList<>();

		while (true) {

			showMission();

			int loginChoice = Integer.parseInt(sc.nextLine());

			switch (loginChoice) {
				case 0:
					break;
				case 1:
					while (true) {
						showAdminMenu();
						int adminChoice = Integer.parseInt(sc.nextLine());
						switch (adminChoice) {
							case 0:
								break;
							case 1:
								ItemsMenu();
								int itemsChoice = Integer.parseInt(sc.nextLine());
								switch (itemsChoice) {
									case 1:
										media.add(createMedia(new DVDCreation()));
										break;
									case 2:
										media.add(createMedia(new CDCreation()));
										break;
									case 3:
										media.add(createMedia(new BookCreation()));
										break;
									default:
										System.out.println("Invalid choice");
										break;
								}
								break;
							case 2:
								System.out.println("Input ID:");
								int id = Integer.parseInt(sc.nextLine());
								media.remove(id);
								System.out.println("Remove sucessfully");
								break;
							case 3:
								int size = media.size();
								for (int i = 0; i < size; i++) {
									System.out.println("ID: " + i + " Title: " + media.get(i).getTitle());
								}
								break;
							case 4:
								Collections.sort(media);
								break;
							default:
								System.out.println("Invalid choice");
								break;

						}
						if (adminChoice == 0)
							break;
					}
					break;
				case 2:
					while (true) {
						showUserMenu();
						int userChoice = Integer.parseInt(sc.nextLine());
						switch (userChoice) {
							case 0:
								break;
							case 1:
								oders.add(Orders.createOrder());
								ordersNumber++;
								break;
							case 2:
								System.out.println("Input title for searching:");
								String searchTitle = sc.nextLine();
								int i;
								for (i = 0; i < media.size(); i++) {
									if (media.get(i).search(searchTitle) == true) {
										System.out.println("ID: " + i + " Title: " + media.get(i).getTitle());
									}
								}
								break;
							case 3:
								System.out.println("Input ID:");
								int id = Integer.parseInt(sc.nextLine());
								if (id < media.size()) {
									oders.get(ordersNumber - 1).addMedia(media.get(id));
									System.out.println("Add media sucessfully");
								} else {
									System.out.println("ID does not exist");
								}
								break;
							case 4:
								System.out.println("Input remove ID:");
								int rmid = Integer.parseInt(sc.nextLine());
								oders.get(ordersNumber - 1).removeMedia(media.get(rmid));
								System.out.println("Remove sucessfully");
								break;
							case 5:
								System.out.println("Orders information:");
								for (int j = 0; j < oders.size(); j++) {
									System.out.println("Order " + (j + 1) + ":");
									oders.get(j).printItemsOrdered();
									System.out.println("Total cost: " + oders.get(j).totalCost());
								}
								break;
							default:
								System.out.println("Invalid choice");
								break;
						}
						if (userChoice == 0)
							break;
					}
					break;
				default:
					break;
			}

			if (loginChoice == 0)
				break;
		}
		sc.close();

	}
}