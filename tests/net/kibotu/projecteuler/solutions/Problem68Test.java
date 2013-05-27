package net.kibotu.projecteuler.solutions;

import net.kibotu.projecteuler.utils.SolutionNotFoundException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Problem68Test {
    @Test
    public void testSolution() {
        try {
            assertEquals(6531031914842725L, new Problem68().getSolution());
        } catch (SolutionNotFoundException ex) {
            fail(ex.toString());
        }
    }
}
