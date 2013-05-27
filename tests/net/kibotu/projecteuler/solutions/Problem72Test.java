package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Problem72Test {
    @Test
    public void testSolution() {
        try {
            Problem72 p = new Problem72();
            assertEquals(303963552391L, p.getSolution());
        } catch (Exception e) {
            fail(e.toString());
        }
    }
}
