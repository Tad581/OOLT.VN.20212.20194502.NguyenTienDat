package Baitap.Lab1;
import javax.swing.JOptionPane;
import java.lang.Math;

public class SovleMath3 {
    public static void main(String args[]) {
        String strA, strB, strC, strNotification;
        double a, b, c, delta, result1, result2; 

        strA = JOptionPane.showInputDialog(null, "Please input the a: ", "Input the a", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(strA);

        strB = JOptionPane.showInputDialog(null, "Please input the b: ", "Input the b", JOptionPane.INFORMATION_MESSAGE);
        b = Double.parseDouble(strB);

        strC = JOptionPane.showInputDialog(null, "Please input the c: ", "Input the c", JOptionPane.INFORMATION_MESSAGE);
        c = Double.parseDouble(strC);

        delta = b*b - 4*a*c;

        if (delta < 0) {
            strNotification = "No result";
        }
        else if (delta == 0) {
            result1 = result2 = -b/(2*a);
            strNotification = "The result of expression is " + result1;
        }
        else{
            delta = Math.sqrt(delta);
            result1 = (-b + delta) / (2*a);
            result2 = (-b - delta) / (2*a);
            strNotification = "The result of expression is " + result1 + " and " + result2;
        }
        
        JOptionPane.showMessageDialog(null, strNotification, "Show result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
