package org.example.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AbstractFactoryTest {
    @Test
    void verifyChenarCreation() {
        AbstractGardenCreator garden = FactoryProvider.getFactory("Iranian");
        assertNotNull(garden);
        AbstractTree tree = garden.createTree();
        assertNotNull(tree);

        assertEquals(tree.toString(),"Chenar");
    }

    @Test
    void verifyKhatmiCreation() {
        AbstractGardenCreator garden = FactoryProvider.getFactory("Iranian");
        assertNotNull(garden);
        AbstractFlower flower = garden.createFlower();
        assertNotNull(flower);

        assertEquals(flower.toString(),"Khatmi");
    }

    @Test
    void verifyJ1Creation() {
        AbstractGardenCreator garden = FactoryProvider.getFactory("Japanese");
        assertNotNull(garden);
        AbstractTree tree = garden.createTree();
        assertNotNull(tree);

        assertEquals(tree.toString(),"J1");
    }


    @Test
    void verifyG1Creation() {
        AbstractGardenCreator garden = FactoryProvider.getFactory("Japanese");
        assertNotNull(garden);
        AbstractFlower flower = garden.createFlower();
        assertNotNull(flower);

        assertEquals(flower.toString(),"G1");
    }
}