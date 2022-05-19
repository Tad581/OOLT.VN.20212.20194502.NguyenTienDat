package Baitap.Lab2;
import java.util.Scanner;

public class PrintStar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the number of line:");
        int numberOfStar = input.nextInt();
        int i, j;
        for (i = 0; i < numberOfStar; i++) {
            for (j = numberOfStar - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i*2 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
