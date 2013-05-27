package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem50Test {
    @Test
    public void testSolution() {
        Problem50 p = new Problem50();
        assertEquals(997651, p.getSolution());
    }
}
