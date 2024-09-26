package gabriel.zoo.com;

// gtc 9/26/24
// Driver file for zoo midterm program.




public class App {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        gabriel.zoo.com.Animal Animal = new gabriel.zoo.com.Animal();
        Animal.setAnimalName("my first animal");
        System.out.println("\n The name of the new animal is: " + Animal.getAnimalName());

        gabriel.zoo.com.Animal Animal2 = new gabriel.zoo.com.Animal();
        Animal2.setAnimalName("Zig");
        System.out.println("\n The name of the second animal is: " + Animal2.getAnimalName());



        }
    }
