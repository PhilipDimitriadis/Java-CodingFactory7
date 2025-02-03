package gr.aueb.cf.ch14.exersices;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("Tommy", 4);
        Cat cat = new Cat("Izma", 3);
        Animal animal = new Animal("Animal", 3);

        doSpeak(dog);
        doSpeak(cat);
        doSpeak(animal);

        System.out.println(dog.toString());
        System.out.println(cat.toString());
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
