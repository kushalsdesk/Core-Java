package arrays;

import java.util.*;

/**
 * ArrayFour
 * The 2d ArrayList is a dynamic list of List
 * And we can change the size of it during runtime
 */
public class ArrayFour {

  public static void main(String[] args) {
    System.out.println("Welcome to the 2d Arraylist");

    // Here is the syntax
    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

    ArrayList<String> bakeryList = new ArrayList<>();
    bakeryList.add("Pasta");
    bakeryList.add("Bread");
    bakeryList.add("Donuts");

    ArrayList<String> produceList = new ArrayList<>();
    produceList.add("tomatos");
    produceList.add("potatoes");
    produceList.add("Sugar");

    ArrayList<String> drinksList = new ArrayList<>();
    drinksList.add("soda");
    drinksList.add("coffee");

    // Add the individual lists to the grocery list

    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinksList);

    System.out.println("Whole list is the :" + groceryList);
    // to access individual items , first inlcude the listNumber, then the
    // itemNumber
    System.out.println("The Second in the DrinksList  " + groceryList.get(2).get(1));
  }
}
