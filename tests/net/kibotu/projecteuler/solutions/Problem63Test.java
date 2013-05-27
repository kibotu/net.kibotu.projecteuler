package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class Problem63Test {
    @Test
    public void testSolution() {
        try {
            assertEquals(49, new Problem63().getSolution());
        } catch (Exception ex) {
            fail();
        }
    }
}
