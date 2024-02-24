package arrays;

import java.util.ArrayList;

/**
 * ArrayThree
 */
public class ArrayThree {

  public static void main(String[] args) {
    System.out.println("Welcome to ArrayList");

    // ArrayList always work with reference data types
    // so always need to provide the Wrapper Class
    ArrayList<String> food = new ArrayList<String>();
    // method add

    food.add("Pizza");
    food.add("Hotdog");
    food.add("Hamberger");

    // Trasverse through ArrayList
    int looper = 0;

    while (looper < food.size()) {
      System.out.println(food.get(looper));
      looper++;
    }

    // Modifiying value with index
    food.set(0, "Sandwitch");
    int i = 0;
    while (i < food.size()) {
      System.out.println(food.get(i));
      i++;
    }

    // Removing element
    food.remove("Pizza");
  }
}
