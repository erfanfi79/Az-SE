package org.example.prototype;

public class Dog implements Animal{
    public Dog(){
        System.out.println("Dog is Made");
    }

    public Animal makeCopy() {
        System.out.println("new Dog is Being Made");
        Dog dogObject = null;
        try {
            dogObject = (Dog) super.clone();
        }


        catch (CloneNotSupportedException e) {
            System.out.println("Clone Not Supported");
            e.printStackTrace();
        }
        return dogObject;
    }
    public String toString(){
        return "Dog";

    }

}
