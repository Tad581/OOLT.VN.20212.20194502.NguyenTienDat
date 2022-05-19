public class Orders{
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS = 5;
	public static int nbOrders = 0;

	private Orders(){

	}

	public static Orders createOrder(){
		if (nbOrders >= MAX_LIMITED_ORDERS)
		{
			System.out.println("You have reached maximum orders");
			return null;
		}
		else {
			nbOrders ++;
			return new Orders();
		}
	}

	private DigitalVideoDisc itemsDVDOdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private CompactDisc itemsCDOdered[] = new CompactDisc[MAX_NUMBERS_ORDERED];
	private MyDate date = new MyDate();
	private int qtyDVDOrdered = 0;
	private int qtyCDOrdered = 0;

	public void addDVD( DigitalVideoDisc d){
		if (qtyDVDOrdered == 10)
			System.out.println("ERROR! you have too much money!!! Spent money on charity or something not those stupid DVDs!!! YOU USELESS");
		else{
			itemsDVDOdered[qtyDVDOrdered] = d;
			qtyDVDOrdered++;
		}
	}

	public void addDVD( DigitalVideoDisc [] d){
		if (qtyDVDOrdered == 10)
			System.out.println("ERROR! you have too much money!!! Spent money on charity or something not those stupid DVDs!!! YOU USELESS");
		else{
			int i = 0;
			for (i = 0;i < d.length;i++){
				if (qtyDVDOrdered == 10)
					System.out.println("ERROR! you have too much money!!! Spent money on charity or something not those stupid DVDs!!! YOU USELESS");
				else{
					itemsDVDOdered[qtyDVDOrdered] = d[i];
					qtyDVDOrdered++;
				}
			}
		}
	}

	public void addDVD( DigitalVideoDisc d1, DigitalVideoDisc d2){
		if (qtyDVDOrdered == 10)
			System.out.println("ERROR! you have too much money!!! Spent money on charity or something not those stupid DVDs!!! YOU USELESS");
		else{
				itemsDVDOdered[qtyDVDOrdered] = d1;
				qtyDVDOrdered++;
				if (qtyDVDOrdered == 10)
					System.out.println("ERROR! you have too much money!!! Spent money on charity or something not those stupid DVDs!!! YOU USELESS");
				else{
					itemsDVDOdered[qtyDVDOrdered] = d2;
					qtyDVDOrdered++;
				}
			}
	}



	public void removeDVD( DigitalVideoDisc d ){
		int i,j;
		for ( i=0; i<qtyDVDOrdered; i++){
			if (itemsDVDOdered[i] == d)
				for (j=i; j<qtyDVDOrdered; j++){
					itemsDVDOdered[j] = itemsDVDOdered[j+1];
				}
		}
		qtyDVDOrdered = qtyDVDOrdered - 1;
	}

	public void addCD( CompactDisc c){
		if (qtyCDOrdered == 10)
			System.out.println("ERROR! you have too much money!!! Spent money on charity or something not those stupid CDs!!! YOU USELESS");
		else{
			itemsCDOdered[qtyCDOrdered] = c;
			qtyCDOrdered++;
		}
	}

	public void addCD( CompactDisc [] c){
		if (qtyCDOrdered == 10)
			System.out.println("ERROR! you have too much money!!! Spent money on charity or something not those stupid DVDs!!! YOU USELESS");
		else{
			int i = 0;
			for (i = 0;i < c.length;i++){
				if (qtyDVDOrdered == 10)
					System.out.println("ERROR! you have too much money!!! Spent money on charity or something not those stupid DVDs!!! YOU USELESS");
				else{
					itemsCDOdered[qtyCDOrdered] = c[i];
					qtyCDOrdered++;
				}
			}
		}
	}

	public void removeCD( CompactDisc c ){
		int i,j;
		for ( i=0; i<qtyCDOrdered; i++){
			if (itemsCDOdered[i] == c)
				for (j=i; j<qtyCDOrdered; j++){
					itemsCDOdered[j] = itemsCDOdered[j+1];
				}
		}
		qtyCDOrdered = qtyCDOrdered - 1;
	}

	public void addDate(MyDate d){
		date = d;
	}

	public float totalCost(){
		int i;
		float total = 0;
		for (i=0;i<qtyDVDOrdered;i++){
			total = total + itemsDVDOdered[i].getCost();
		}
		for (i=0;i<qtyCDOrdered;i++){
			total = total + itemsCDOdered[i].getCost();
		}
		return total;
	}

	public void printOrders(Orders o){
		System.out.println("Order " + nbOrders);
		System.out.print("Date: ");
		date.printCur(date);
		System.out.println("Ordered items: ");
		int i;
		for (i=0;i<qtyDVDOrdered;i++){
			System.out.println("CD - " + itemsDVDOdered[i].getTitle());
		}
		for (i=0;i<qtyCDOrdered;i++){
			System.out.println("CD - " + itemsCDOdered[i].getTitle());
		}
	}
}