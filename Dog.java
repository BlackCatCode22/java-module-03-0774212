public class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        name = name;

    }

    public String getName() {
        return name;
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Dog (int age) {
        this.age = age;
    }

    public Dog (String name, int age) {
        this.age = age;
        this.name = name;
    }
}
