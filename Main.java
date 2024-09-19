
// 09/19/24 GTC

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Hello and welcome to the Zoo Program!");

        // Open the arriving animals file.
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\BE218\\Downloads\\arrivingAnimals.txt"));
            String myLine;

            // Read the file one line at a time.
            while ((myLine = bufferedReader.readLine()) != null) {
                System.out.println(myLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Create an Animal object.
        Animal animalOne = new Animal();
        animalOne.setAge(4);

        // Use our new Animal object.
        System.out.println("\n My animal's age is: " + animalOne.getAge() + " years old.");

        // Create a Hyena object.
        Hyena myNewHyena = new Hyena();
        myNewHyena.setAge(7);

        // Output the age of our new Hyena
        System.out.println("\n The age of our Hyena is " + myNewHyena.getAge() + " years old.");

        // Create a Lion object.
        Lion myNewLion = new Lion();
        myNewLion.setAge(12);

        // Make the lion 12 years old.
        System.out.println("\n The age of my lion is " + myNewLion.getAge() + " years old.");

        // Output the number of animals.
        System.out.println("\n The number of animals created is: " + Animal.numOfAnimals);
        }
    }