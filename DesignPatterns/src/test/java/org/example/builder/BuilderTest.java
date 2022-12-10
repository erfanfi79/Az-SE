package org.example.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class BuilderTest {
        @Test
        void testMissingTopic() {
            assertThrows(IllegalArgumentException.class, () -> new Order.Builder(null, 120));
        }

        @Test
        void testZeroDeadline() {
            assertThrows(IllegalArgumentException.class, () -> new Order.Builder("topic", 0));
        }

        @Test
        void testBuildHero() {
            final String heroName = "Sir Lancelot";

            final Order order = new Order.Builder("Monitor", 12443).withAddress("tehran").withPackageNumber(1).build();

            assertNotNull(order);
            assertNotNull(order.toString());
            assertEquals("Monitor", order.getTopic());
            assertEquals(12443, order.getEndTime());
            assertEquals("tehran", order.getAddress());
            assertEquals(1, order.getNumberOfPackages());


        }


}