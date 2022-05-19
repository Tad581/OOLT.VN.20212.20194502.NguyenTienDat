package Baitap.Lab2;
import java.util.Scanner;

public class Sort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the length of array:");
        int n = input.nextInt(); 
        System.out.println("Input the data of array:");
        int[] array2 = new int[n];
        int i, j, temp, sum = 0, average = 0;
        for (i = 0; i < n; i++) {
            array2[i] = input.nextInt();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (array2[i] > array2[j]) {
                    temp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp;
                }
            }
        }


        System.out.println("");
        for (i = 0; i < n; i++) {
            sum += array2[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println("The sum of your array is: " + sum);
        average = sum/n;
        System.out.println("The average of your array is: " + average);

        input.close();
        System.exit(0);
    }
}
