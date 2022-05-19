package Baitap.Lab2;
import java.util.Scanner;

public class Matrics {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the size of matrics:"); 
        int m = input.nextInt();
        int n = input.nextInt();

        int[][] matric1 = new int[m][n];
        int[][] matric2 = new int[m][n];

        System.out.println("Input the value of matric 1: ");
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matric1[i][j] = input.nextInt();
            }
        }

        System.out.println("Input the value of matric 2: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matric2[i][j] = input.nextInt();
            }
        }

        System.out.println("Your matric 1:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matric1[i][j] + " ");
            }
            System.out.println("");
        }

        
        System.out.println("Your matric 2:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matric2[i][j] + " ");
            }
            System.out.println("");
        }

        System.exit(0);
    }
}
