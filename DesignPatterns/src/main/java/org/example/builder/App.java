package org.example.builder;

public class App {

    public static void main(String[] args) {
        Order sampleOrder = new Order.Builder("Monitor", 12443).withAddress("tehran").withPackageNumber(1).build();
        System.out.println(sampleOrder.toString());
    }

}
