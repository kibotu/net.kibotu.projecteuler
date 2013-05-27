package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Problem49Test {

    @Test
    public void testSolution() {
        try {
            Problem49 p = new Problem49();
            assertEquals(296962999629L, p.getSolution());
        } catch (Exception e) {
            fail();
        }
    }

}
