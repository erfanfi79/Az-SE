package org.example.prototype;

public class Cat implements Animal{
    public Cat(){
        System.out.println("Cat is Made");
    }

    public Animal makeCopy() {
        System.out.println("new Cat is Being Made");
        Cat catObject = null;
        try {
            catObject = (Cat) super.clone();
        }


        catch (CloneNotSupportedException e) {
            System.out.println("Clone Not Supported");
            e.printStackTrace();
        }
        return catObject;
    }
    public String toString(){
        return "Cat";

    }

}
