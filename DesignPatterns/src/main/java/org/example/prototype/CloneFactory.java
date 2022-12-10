package org.example.prototype;

public class CloneFactory {
    public Animal getClone(Animal sampleAnimal){
        return sampleAnimal.makeCopy();
    }
}
