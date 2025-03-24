package gr.aueb.cf.ch15.exersices;

public class Dog extends Animal {

    public Dog() {

    }

    public Dog(int age, String name) {
        super(name, age);
    }

    public void speak() {
        System.out.println("I am dog");
    }

    public String toString() {
        return "id: " + getAge() + ", name: " + getName();
    }
}
