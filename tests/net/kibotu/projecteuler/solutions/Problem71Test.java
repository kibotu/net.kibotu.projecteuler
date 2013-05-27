package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem71Test {

    @Test
    public void testSolution() {
        Problem71 p = new Problem71();
        assertEquals(428570, p.getSolution());
    }
}
