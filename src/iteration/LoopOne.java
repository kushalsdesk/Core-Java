package iteration;

import java.util.Scanner;

/**
 * LoopOne
 */
public class LoopOne {

  public static void main(String[] args) {
    System.out.println("Welcome the Looping in java");
    Scanner sc = new Scanner(System.in);
    String name = "";
    while (name.isBlank()) {
      System.out.println("Enter You Name: ");
      name = sc.nextLine();
    }

    System.out.println("Your name is " + name);

    sc.close();
  }
}
