package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Problem67Test {
    @Test
    public void testSolution() {
        try {
            assertEquals(7273, new Problem67().getSolution("triangle.txt"));
        } catch (Exception e) {
            fail(e.toString());
        }
    }
}
