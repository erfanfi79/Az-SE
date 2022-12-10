package org.example.abstractfactory;

public class App {

    public static void main(String[] args) {
        AbstractGardenCreator garden = FactoryProvider.getFactory("Iranian");
        AbstractFlower flower = garden.createFlower();
        AbstractTree tree = garden.createTree();
    }


}