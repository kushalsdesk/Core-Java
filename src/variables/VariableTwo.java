package variables;

/**
 * VariableTwo
 */
public class VariableTwo {

  public static void main(String[] args) {
    String x = "water";
    String y = "Kool-aid";
    String temp;

    // Swapping with the help of third variable
    temp = x;
    x = y;
    y = temp;

    System.out.println("x: " + x);
    System.out.println("y: " + y);

  }
}
