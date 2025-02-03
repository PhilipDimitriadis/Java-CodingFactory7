package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {

        ISpeakable cat = new Cat("Alice");
        ISpeakable dog = new Dog("Bob");

        cat.speak();
        dog.speak();

        doSpeak(cat);
        doSpeak(dog);
    }

    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
