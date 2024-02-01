package variables;

import java.util.Random;

/**
 * RandomNum
 */
public class RandomNum {

  public static void main(String[] args) {
    Random random = new Random();
    System.out.println("Guess the Number");
    int x = random.nextInt(6) + 1;
    System.out.println("The Number can be " + x);
  }
}
