package conditional;

/**
 * CondOne
 * if else statement = performs a code block if any initial condition id true
 */
public class CondOne {

  public static void main(String[] args) {
    System.out.println("Welcome to Conditional Blocks");

    int age = 14;

    if (age >= 18) {
      System.out.println("You are an adult");
    } else if (age >= 75) {
      System.out.println("You are a Senior");
    } else {
      System.out.println("You are not an adult");
    }
  }
}
