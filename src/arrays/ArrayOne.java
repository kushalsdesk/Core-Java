package datastructures;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ArrayOne
 */
public class ArrayOne {

  public static void main(String[] args) {
    // creating arrays
    // with initialization only need to provide the size
    String[] superCars = new String[5];
    int looper = 0;
    Scanner sc = new Scanner(System.in);
    while (looper < superCars.length) {
      System.out.println("Enter the Super You wanna Enter At position " + looper);
      String name = sc.nextLine();
      superCars[looper] = name;
      looper++;
    }

    // with declaration
    String[] cars = { "Camaro", "Jaguar", "Tesla" };

    System.out.println("The Supercars you mentioned: " + Arrays.toString(superCars));
    System.out.println("The predefined cars: " + Arrays.toString(cars));

    sc.close();
  }
}
