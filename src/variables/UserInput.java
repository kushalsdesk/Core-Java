package variables;

import java.util.Scanner;

/**
 * UserInput
 */
public class UserInput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is your vision?");
    String vis = sc.nextLine();
    System.out.println("What is the year?");
    int year = sc.nextInt();

    System.out.println("Yes you are right with " + vis + " in " + year);

  }
}
