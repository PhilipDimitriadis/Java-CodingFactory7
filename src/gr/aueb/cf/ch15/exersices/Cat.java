package gr.aueb.cf.ch15.exersices;

public class Cat extends Animal {

    public Cat() {

    }

    public Cat(int age, String name) {
        super(name, age);
    }

    public void speak() {
        System.out.println("I am cat");
    }

    public String toString() {
        return "id: " + getAge() + ", name: " + getName();
    }
}
