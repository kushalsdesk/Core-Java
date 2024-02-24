package strings;

/**
 * StringOne
 */
public class StringOne {

  public static void main(String[] args) {
    System.out.println("String Methods in Java");
    String name = "Kushal";

    System.out.println(name.equals("Kushal"));
    System.out.println(name.equalsIgnoreCase("kushal"));
    System.out.println(name.charAt(2));
    System.out.println(name.indexOf("h"));
    System.out.println(name.trim());
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.replace("al", "ol"));
  }
}
