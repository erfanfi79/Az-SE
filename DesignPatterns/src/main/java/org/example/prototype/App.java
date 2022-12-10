package org.example.prototype;

public class App {
    public static void main(String[] args){
        CloneFactory animalMaker = new CloneFactory();

        Dog dog1 = new Dog();

        Dog clonedDog = (Dog) animalMaker.getClone(dog1);

        System.out.println(dog1);

        System.out.println(clonedDog);

        System.out.println("Dog1 HashCode: " + System.identityHashCode(System.identityHashCode(dog1)));

        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedDog)));

        Cat cat1 = new Cat();

        Cat clonedCat = (Cat) animalMaker.getClone(cat1);

        System.out.println(cat1);

        System.out.println(clonedCat);

        System.out.println("cat1 HashCode: " + System.identityHashCode(System.identityHashCode(dog1)));

        System.out.println("Clone cat HashCode: " + System.identityHashCode(System.identityHashCode(clonedCat)));
    }
}
