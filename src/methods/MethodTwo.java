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

class Game {
  private String gameName;

  public void setGameName(String name) {
    this.gameName = name;
  }

  public void getGameName() {
    System.out.println("The name of the game " + gameName);
  }

  void makeGame() {
    System.out.println("Making a game with the method");
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

    // Class examples with the Game Class
    Game game = new Game();
    game.setGameName("Forza Horizon 4");
    game.getGameName();
  }
}
