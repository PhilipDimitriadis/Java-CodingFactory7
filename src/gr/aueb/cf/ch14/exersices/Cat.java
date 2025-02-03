package gr.aueb.cf.ch14.exersices;

public class Cat extends Animal {

    public Cat() {

    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
