import java.util.Calendar;
import java.util.Scanner;

public class MyDate{
	private String day;
	private String month;
	private String year;

	public MyDate(){
		Calendar calendar = Calendar.getInstance();
		this.day = String.valueOf(calendar.get(Calendar.DATE));
		this.month = String.valueOf(calendar.get(Calendar.MONTH));
		this.year = String.valueOf(calendar.get(Calendar.YEAR));
	}

	public MyDate(String day, String month, String year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public MyDate(String date){
		String[] temps = date.split("\\s");
		this.setMonth(temps[0]);
		this.setDay(temps[1]);
		this.setYear(temps[2]);
	}

	public String getDay(){
		return day;
	}
	public void setDay(String day){
		this.day = day;
	}
	public String getMonth(){
		return month;
	}
	public void setMonth(String month){
		this.month = month;
	}
	public String getYear(){
		return year;
	}
	public void setYear(String year){
		this.year = year;
	}
	
	public MyDate accept (){
		System.out.println("Please enter a date (Must be a string): ");
		Scanner inputDate = new Scanner(System.in);
		String s = inputDate.nextLine();
		if (s.isEmpty() || s == null) {
			MyDate newDate = new MyDate();
			inputDate.close();
			return newDate;
		} else {
			MyDate newDate = new MyDate(s);
			inputDate.close();
			return newDate;
		}
	}

	public void print (MyDate date){
		System.out.print(date.month + " " + date.day + " " + date.year);
	}

}