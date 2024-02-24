package conditional;

import java.util.Scanner;

/**
 * CondTwo
 */
public class CondTwo {

  public static void main(String[] args) {
    System.out.println("Welcome to a switch block");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter one Name of Day(Sunday, Monday)");
    String day = sc.nextLine();

    switch (day) {
      case "Sunday":
        System.out.println("Its a Sunday");
        break;
      case "Monday":
        System.out.println("Its a Monday");
        break;
      case "Tuesday":
        System.out.println("Its a Tuesday");
        break;
      case "Wednesday":
        System.out.println("Its a Wednesday");
        break;
      case "Thursday":
        System.out.println("Its a Thursday");
        break;
      case "Friday":
        System.out.println("Its a Friday");
        break;
      case "Saturday":
        System.out.println("Its a Saturday");
        break;
      default:
        System.out.println("This is not a day");
        break;
    }

    sc.close();
  }
}
