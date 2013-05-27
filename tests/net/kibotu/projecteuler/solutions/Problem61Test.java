package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Problem61Test {
    @Test
    public void testSolution() {
        try {
            assertEquals(28684, new Problem61().getSolution());
        } catch (Exception ex) {
            fail();
        }
    }
}
