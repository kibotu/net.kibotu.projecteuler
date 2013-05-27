package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem46Test {
    @Test
    public void testSolution() {
        Problem46 p = new Problem46();
        assertEquals(5777, p.getSolution());
    }
}
