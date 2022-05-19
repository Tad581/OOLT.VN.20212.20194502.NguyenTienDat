package Baitap.Lab1;
import javax.swing.JOptionPane;

public class SovleMath2 {

    public static void main(String args[]) {
        String strA11, strA12, strA21, strA22, strB1, strB2, strNotification;
        double a11, a12, a21, a22, b1, b2, result1, result2, D, D1, D2; 

        strA11 = JOptionPane.showInputDialog(null, "Please input the a11: ", "Input the a11", JOptionPane.INFORMATION_MESSAGE);
        a11 = Double.parseDouble(strA11);

        strA12 = JOptionPane.showInputDialog(null, "Please input the a12: ", "Input the a12", JOptionPane.INFORMATION_MESSAGE);
        a12 = Double.parseDouble(strA12);

        strB1 = JOptionPane.showInputDialog(null, "Please input the b1: ", "Input the b1", JOptionPane.INFORMATION_MESSAGE);
        b1 = Double.parseDouble(strB1);

        strA21 = JOptionPane.showInputDialog(null, "Please input the a21: ", "Input the a21", JOptionPane.INFORMATION_MESSAGE);
        a21 = Double.parseDouble(strA21);

        strA22 = JOptionPane.showInputDialog(null, "Please input the a22: ", "Input the a22", JOptionPane.INFORMATION_MESSAGE);
        a22 = Double.parseDouble(strA22);

        strB2 = JOptionPane.showInputDialog(null, "Please input the b2: ", "Input the b2", JOptionPane.INFORMATION_MESSAGE);
        b2 = Double.parseDouble(strB2);

        D = a11 * a22 - a12 * a21;
        D1 = b1 * a22 - b2 * a12;
        D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 + D2 == 0) {
                strNotification = "Infinite result";
            } else {
                strNotification = "No result";
            }
        } else {
            result1 = D1/D;
            result2 = D2/D;
            strNotification = "The result is " + result1 + " and " + result2;
        }

        
        JOptionPane.showMessageDialog(null, strNotification, "Show result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
