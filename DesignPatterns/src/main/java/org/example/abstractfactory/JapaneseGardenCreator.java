package org.example.abstractfactory;

public class JapaneseGardenCreator implements AbstractGardenCreator{
    @Override
    public AbstractTree createTree() {
        return new J1();
    }

    @Override
    public AbstractFlower createFlower() {
        return new G1();
    }
}
