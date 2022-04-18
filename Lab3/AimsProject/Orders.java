
public class Orders {
	
	// TODO Auto-generated method stub
	public static final int MAX_NUMBERS_ORDERED = 10;
		
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	private int qtyOrdered = 0;	
	
	public void addDVD (DigitalVideoDisc d) { 
		itemsOrdered[qtyOrdered] = d;
		qtyOrdered++;
		if (qtyOrdered > MAX_NUMBERS_ORDERED) {
			System.out.print("Your DVD list is full");
		}
	}
	
	public void removeDVD (DigitalVideoDisc d) {
		int i, j;
		qtyOrdered--;
		for (i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (itemsOrdered[i] == d) {
				for (j = i; j < MAX_NUMBERS_ORDERED - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j+1]; 
				}
				itemsOrdered[MAX_NUMBERS_ORDERED - 1] = null;
				break;
			}
		}
	}
	
	public float totalCost () {
		int i;
		float total = 0;
		for (i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
}
