//import java.util.*;

import javax.swing.JOptionPane;

public class club {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog(null, "Enter your name: "); // Correct method to get user input
        JOptionPane.showMessageDialog(null, "The name of the user is " + name); // Correct usage of showMessageDialog to display the name
    }
}
