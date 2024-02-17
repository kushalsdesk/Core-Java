package methods;

/**
 * MethodTwo
 * For showcasing the OverLoadedMethods
 *
 */

class Calculator {

  int add(int a, int b) {
    return a + b;
  }

  double add(double a, double b) {
    return a + b;
  }
}

class Pizza {

  void makePizza() {
    System.out.println("Making a plain pizza with tomato sauce and cheese.");
  }

  void makePizza(String topping) {
    System.out.println("Making a pizza with " + topping + " and cheese.");
  }

  void makePizza(String topping1, String topping2) {
    System.out.println("Making a pizza with " + topping1 + " and " + topping2 + " on top.");
  }
}

public class MethodTwo {

  public static void main(String[] args) {
    // Pizza example
    Pizza pizza = new Pizza(); // create an instance of `Pizza` class
    pizza.makePizza(); // invokes the first method
    pizza.makePizza("mushroom"); // invokes the second method
    pizza.makePizza("meat", "paneer");

    // Another Class for example

    Calculator calc = new Calculator();
    System.out.println(calc.add(8.978, 9.56));
    System.out.println(calc.add(81, 9));
  }
}
