package gabriel.zoo.com;


public class Hyena extends Animal {
    //Create a static int that keeps track of the number of hyenas created.
    static int numOfHyenas = 0;

    //Create a constructor.
    public Hyena(String someName){
        super(someName);
        numOfHyenas++;
    }
}
