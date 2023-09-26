// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Animal {
    private static int numOfAnimals = 0;

    // Create a getter.
    public int getNumOfAnimals() {
        return numOfAnimals;
    }
    // Constructor
    public Animal() {
        System.out.print("\n A new animal was born into this world.");
        numOfAnimals++;

    }

    }
