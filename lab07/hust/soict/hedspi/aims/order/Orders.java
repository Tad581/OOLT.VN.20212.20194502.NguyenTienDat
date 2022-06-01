package order;

import media.*;

import java.util.ArrayList;

public class Orders {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITTED_ORDERS = 5;
    public static int nbOrders = 0;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    private Orders() {

    }

    public static Orders createOrder() {
        if (nbOrders >= MAX_LIMITTED_ORDERS) {
            System.out.println("You have reached maximum orders");
            return null;
        } else {
            nbOrders++;
            return new Orders();
        }
    }

    public boolean checkMediaExist(Media item) {
        for (Media itemOrdered : itemsOrdered) {
            if (itemOrdered.getTitle().equals(item.getTitle())) {
                return true;
            }
        }
        return false;
    }

    public void addMedia(Media item) {
        if (checkMediaExist(item)) {
            System.out.println(item.getTitle() + "is already exist");
            return;
        } else if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("Ordered list is full");
            return;
        }
        itemsOrdered.add(item);
        System.out.println(item.getTitle() + "was added");
    }

    public void removeMedia(Media item) {
        if (checkMediaExist(item) == false) {
            System.out.println(item.getTitle() + "not already exist");
        }
        itemsOrdered.remove(item);
        System.out.println(item.getTitle() + "was removed");
    }

    public float totalCost() {
        float sum = 0.0f;
        for (Media itemOrdered : itemsOrdered) {
            sum += itemOrdered.getCost();
        }
        return sum;
    }

    public ArrayList<Media> getItemsOrdered() {
        return this.itemsOrdered;
    }

    public void printItemsOrdered() {
        for (Media item : itemsOrdered) {
            System.out.println(
                    "Title: " + item.getTitle() + " - Category: " + item.getCategory() + " - Cost: " + item.getCost());
        }
    }

    public static void main(String[] args) {

    }
}