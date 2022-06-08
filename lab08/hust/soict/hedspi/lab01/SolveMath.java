package Baitap.Lab1;
import javax.swing.JOptionPane;

public class SolveMath {
    public static void main(String args[]) {
        String strNum1, strNum2, strNotification;
        double num1, num2, result; 

        strNum1 = JOptionPane.showInputDialog(null, "Please input the a: ", "Input the a", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the b: ", "Input the b", JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);

        result = (-num2)/num1;

        strNotification = "The result of " + strNum1 + "x + " + strNum2 + " = 0: " + result;
        
        JOptionPane.showMessageDialog(null, strNotification, "Show result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
