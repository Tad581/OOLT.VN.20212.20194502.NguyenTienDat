public class DataTest{

	public static void main(String[] args){
		MyDate date = new MyDate();

		date = date.accept();
		System.out.println("Constructor 1:");
		date.print(date); 
		System.out.println();

		MyDate date1 = new MyDate("Monday", "April", "2022");
		System.out.println("Constructor 2:");
		date1.print(date1);
		System.out.println();

		MyDate date2 = new MyDate();

		System.out.println("Constructor 3:");
		date2.print(date2); 

	}

}