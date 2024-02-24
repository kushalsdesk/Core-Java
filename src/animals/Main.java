package animals;

// 1. Define the core Animal concept
abstract class Animal { // Base class for all animals
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void makeSound(); // Abstract method for animal sound
}

// 1. Define interfaces for animal types (corrected to interfaces)
abstract class Amphibian extends Animal {
}

abstract class Feline extends Animal {
}

abstract class Mammal extends Animal {
}

// 2. Implement concrete animal classes
class Frog extends Amphibian {
  @Override
  public void makeSound() {
    System.out.println("Ribbit!");
  }
}

class Cat extends Feline {
  @Override
  public void makeSound() {
    System.out.println("Meow!");
  }
}

class Dog extends Mammal {
  @Override
  public void makeSound() {
    System.out.println("Woof!");
  }
}

// 3. Create a container class for multiple animals
class AnimalResults {
  private Amphibian amphibian;
  private Feline feline;
  private Mammal mammal;

  public AnimalResults(Amphibian amphibian, Feline feline, Mammal mammal) {
    this.amphibian = amphibian;
    this.feline = feline;
    this.mammal = mammal;
  }

  // Getters to access individual animals
  public Amphibian getAmphibian() {
    return amphibian;
  }

  public Feline getFeline() {
    return feline;
  }

  public Mammal getMammal() {
    return mammal;
  }
}

// 4. Main program flow (corrected method calls)
public class Main {
  public static void main(String[] args) {
    // Get a collection of animals
    AnimalResults results = getAnimals();

    // Set animal names (corrected access through concrete classes)
    results.getAmphibian().setName("Mr. Toad");
    results.getFeline().setName("Zack");
    results.getMammal().setName("Doggo");

    // Access and print animal names (corrected access through concrete classes)
    System.out.println("Amphibian: " + results.getAmphibian().getName());
    System.out.println("Feline: " + results.getFeline().getName());
    System.out.println("Mammal: " + results.getMammal().getName());

    // Make animal sounds (corrected access through concrete classes)
    results.getAmphibian().makeSound();
    results.getFeline().makeSound();
    results.getMammal().makeSound();
  }

  // Function to create and return multiple animal objects
  public static AnimalResults getAnimals() {
    Frog frog = new Frog();
    Cat cat = new Cat();
    Dog dog = new Dog();
    return new AnimalResults(frog, cat, dog);
  }
}
