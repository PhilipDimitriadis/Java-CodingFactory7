package gr.aueb.cf.ch15.exersices;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat(2, "White Cat");
        Animal dog = new Dog(3, "Black Dog");
        cat.speak();
        dog.speak();
        System.out.println(cat);
        System.out.println(dog);
    }
}
