public class Main {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my Zoo!!");

        //Look at our animalNames file!
        //call inputHyenaNames()
        Hyena.inputHyenaNames();

        //Create a Hyena object.
        Hyena myNewHyena = new Hyena();

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfAnimals());

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfHyenas());

        Hyena anotherHyena = new Hyena();

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfAnimals());
        System.out.println("\n Number of hyenas: " + anotherHyena.getNumOfHyenas());


    }
}
