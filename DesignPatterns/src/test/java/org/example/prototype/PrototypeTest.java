package org.example.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {
    @Test
    void testPrototype() {
        CloneFactory animalMaker = new CloneFactory();

        Dog dog1 = new Dog();

        Dog clonedDog = (Dog) animalMaker.getClone(dog1);

        assertNotNull(clonedDog);
        assertEquals(dog1.toString(),clonedDog.toString());
        assertNotEquals(System.identityHashCode(System.identityHashCode(dog1)),System.identityHashCode(System.identityHashCode(clonedDog)));

        Cat cat1 = new Cat();

        Cat clonedCat = (Cat) animalMaker.getClone(cat1);

        assertNotNull(clonedCat);
        assertEquals(cat1.toString(),clonedCat.toString());
        assertNotEquals(System.identityHashCode(System.identityHashCode(cat1)),System.identityHashCode(System.identityHashCode(clonedCat)));

    }
}