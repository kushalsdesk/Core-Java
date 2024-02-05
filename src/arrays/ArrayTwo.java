package arrays;

import java.util.Scanner;

/**
 * ArrayTwo
 */
public class ArrayTwo {

  public static void main(String[] args) {
    System.out.println("Enter The 2D Storage");

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the no. of rows: ");
    int rows = sc.nextInt();

    System.out.println("Enter the no. of columns: ");
    int cols = sc.nextInt();
    sc.nextLine();

    String[][] cars = new String[rows][cols];

    int outer = 0;
    do {
      int inner = 0;
      do {
        // Show array state before initial input
        System.out.println("The State of Current Array");
        printArray(cars);
        System.out.print("Enter the New car name(@" + outer + ", " + inner + "): ");

        String carName = sc.nextLine();
        cars[outer][inner] = carName;

        inner++;
      } while (inner < cols);

      outer++;
    } while (outer < rows);

    System.out.println("The Final Array:");
    printArray(cars);

    sc.close();
  }

  public static void printArray(String[][] array) {
    int rows = array.length;
    int columns = array[0].length;

    // Header row with column numbers
    int col = 0;
    while (col < columns) {
      System.out.print(" | " + (col + 1));
      col++;
    }
    System.out.println(" |");

    // Top border
    int i = 0;
    while (i < columns * 3 + 1) {
      System.out.print("-");
      i++;
    }
    System.out.println();

    // Data rows
    int row = 0;
    while (row < rows) {
      System.out.print("| " + (row + 1) + " | ");
      col = 0;
      while (col < columns) {
        System.out.print(" " + array[row][col] + " | ");
        col++;
      }
      System.out.println();
      row++;
    }

    // Bottom border
    i = 0;
    while (i < columns * 3 + 1) {
      System.out.print("-");
      i++;
    }
    System.out.println();
  }
}
