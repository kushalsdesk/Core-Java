package graphical;

import javax.swing.JOptionPane;

/**
 * GraphicalOne
 */
public class GraphicalOne {

  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name:");
    JOptionPane.showMessageDialog(null, "Hello " + name);

    int time = Integer.parseInt(JOptionPane.showInputDialog("Enter you Time"));
    JOptionPane.showMessageDialog(null, "Your time is " + time + " ");

    double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter you Amount"));
    JOptionPane.showMessageDialog(null, "Your amount is " + amount + " ");

  }
}
