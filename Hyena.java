import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hyena extends Animal {
    private static int numOfHyenas = 0;

    // Create a constructor that will increment when a new object is created.
    public Hyena() {
        System.out.println("\n A new Hyena object was created.");
        numOfHyenas++;
    }

    // Create a method that inputs Hyena names from a file named: animalNames.txt
    public static void inputHyenaNames() {
        //Open animal.Names.txt
        String filePath = "C:\\Users\\BE218\\IdeaProjects\\animalNames.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                waitForEnterKey();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void waitForEnterKey() {
        System.out.println("Press Enter to continue...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Write a getter method.
    public int getNumOfHyenas() {
        return numOfHyenas;
    }
}
