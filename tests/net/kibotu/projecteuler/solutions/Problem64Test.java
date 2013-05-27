package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Problem64Test {

    @Test
    public void testSolution() {
        try {
            assertEquals(1322, new Problem64().getSolution());
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
}