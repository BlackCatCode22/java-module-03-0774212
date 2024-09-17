//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog alphaDog = new Dog();
        Dog betaDog = new Dog();

        Dog myDog = new Dog("Koromaru", 18);
        System.out.println("My dog's name is " + myDog.getName() + ". He is " + myDog.getAge() + " years old.");

        Dog myDog2 = new Dog("Harp", 9);
        System.out.println("My dog's name is " + myDog2.getName() + ". She is " + myDog2.getAge() + " years old.");

        myDog2.setAge(myDog2.getAge() + 1);
        System.out.println(" my dog" + myDog2.getName() + ", had a birthday and age is now: " + myDog2.getAge() );

    }
}