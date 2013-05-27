package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem44Test {
    @Test
    public void testPentagonal() {
        Problem44 p = new Problem44();
        assertEquals(1, p.getPentNumber(1));
        assertEquals(145, p.getPentNumber(10));
    }

    @Test
    public void testSolution() {
        Problem44 p = new Problem44();
        assertEquals(5482660, p.getSolution());
    }
}
