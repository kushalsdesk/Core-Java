package methods;

import java.util.Scanner;

/**
 * MethodOne
 * for syntax rewinding with examples
 */
public class MethodOne {

  public static void main(String[] args) {
    System.out.println("Methods of Java");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your username: ");
    String userName = sc.nextLine();
    hello(userName);
    System.out.println(add(5, 8));
    sc.close();
  }

  // static method, as it will invoked in another static method(static main)
  static void hello(String user) {
    System.out.println("Hello" + user);
  }

  // with an actual return_type than `void`
  static int add(int x, int y) {
    return x + y;
  }
}
