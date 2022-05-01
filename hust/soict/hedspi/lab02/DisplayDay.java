package Baitap.Lab2;
import java.util.Scanner;

public class DisplayDay {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the month");
        String month = input.nextLine();
        System.out.println("Input the year:");
        int year = input.nextInt();
        System.out.println(year + " " + month);

        int days = 0;

        if (month.equals("January")  || month.equals("Jan.")  || month.equals("Jan")  || month.equals("1")  
            || month.equals("March")  || month.equals("Mar.")  || month.equals("Mar")  || month.equals("3")  
            || month.equals("May")  || month.equals("May.")  || month.equals("May")  || month.equals("5")  
            || month.equals("July")  || month.equals("Jul.")  || month.equals("July")  || month.equals("7")  
            || month.equals("August")  || month.equals("Aug.")  || month.equals("Aug")  || month.equals("8")  
            || month.equals("October")  || month.equals("Oct.")  || month.equals("Oct")  || month.equals("10")  
            || month.equals( "December") || month.equals("Dec.")  || month.equals("Dec")  || month.equals("12") ) {
                days = 31;
            }
        else if (month.equals("April")  || month.equals("Apr.")  || month.equals("Apr")  || month.equals("4")  
            ||  month.equals("June")  || month.equals("Jun.")  || month.equals("Jun")  || month.equals("6") 
            ||  month.equals("September")  || month.equals("Sep.")  || month.equals("Sep")  || month.equals("9") 
            ||  month.equals("November")  || month.equals("Nov.")  || month.equals("Nov")  || month.equals("11") ) {
                days = 30;
            }
        else if (month.equals("February") || month.equals("Feb.")  || month.equals("Feb")  || month.equals("2") ) {
            if (year % 4 == 0) {
                days = 29;
            } 
            else {
                days = 28;
            }
        } else {
            System.out.println("Invalid value!");
        }

        System.out.println("The day of " + year + " " + month + " is " + days);
        input.close();
        System.exit(0);
    }
}
