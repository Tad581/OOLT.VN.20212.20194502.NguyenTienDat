public class Aims{
	public static void main(String[] args) {
		Orders anOrder = new Orders();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);

		anOrder.addDVD(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",124,24.95f);

		anOrder.addDVD(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation","John Musker",90,18.99f);

		anOrder.addDVD(dvd3);

		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());

		anOrder.removeDVD(dvd3);

		System.out.println("Remove " + dvd3.getTitle());
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());


	}
}