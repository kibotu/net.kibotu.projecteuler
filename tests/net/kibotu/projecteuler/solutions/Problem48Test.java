package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem48Test {
    @Test
    public void testSolution() {
        Problem48 p = new Problem48();
        assertEquals(9110846700L, p.getSolution());
    }
}
