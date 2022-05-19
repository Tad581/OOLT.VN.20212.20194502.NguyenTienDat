public class Orders{
	public static final int MAX_NUMBERS_ORDERED = 10;

	private DigitalVideoDisc itemsOdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	private int qtyOrdered = 0;

	public void addDVD( DigitalVideoDisc d){
		if (qtyOrdered == 10)
			System.out.println("ERROR! you have too much money!!! Spent money on charity or something not those stupid DVDs!!! YOU USELESS");
		else{
			itemsOdered[qtyOrdered] = d;
			qtyOrdered++;
		}
	}

	public void removeDVD( DigitalVideoDisc d ){
		int i,j;
		for ( i=0; i<qtyOrdered; i++){
			if (itemsOdered[i] == d)
				for (j=i; j<qtyOrdered; j++){
					itemsOdered[j] = itemsOdered[j+1];
				}
		}
		qtyOrdered = qtyOrdered - 1;
	}

	public float totalCost(){
		int i;
		float total = 0;
		for (i=0;i<qtyOrdered;i++){
			total = total + itemsOdered[i].getCost();
		}
		return total;
	}
}