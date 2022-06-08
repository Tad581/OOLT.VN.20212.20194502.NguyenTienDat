import disc.DigitalVideoDisc;

import media.Media;

public class TestMediaCompareTo {

    java.util.Collection collection = new java.util.ArrayList();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Lion King", "Animation", 0.0, 87, "Tommy Xiaomi");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Harry Poter", "Fiction", 0.0, 12, "Tomy Xiaomi");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Starwar", "Fiction", 0.0, 14, "Tomy Xiaomi");
        
        media.add(dvd2);
        media.add(dvd1);
        media.add(dvd3);

   

    // Iterate through the ArrayList and output their titles
    // (unsorted order)
    java.util.Iterator iterator = collection.iterator();


     // Sort the collection of DVDs - based on the comparedTo()
    // method

    java.util.Collections.sort((java.util.List)collection);

    // Iterate through the ArrayList and output their titles
    // in sorted order
    iterator = collection.iterator();

    System.out.println("_________________________________");
    System.out.println("The DVDs currently in the order are: ");

    while (iterator.hasNext()) {
        System.out.print(((DigitalVideoDisc)iterator.next()).getTitle());
    }

    System.out.println("_________________________________");    
}
