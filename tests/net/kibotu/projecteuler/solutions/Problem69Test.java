package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Problem69Test {
    @Test
    public void testSolution() {
        try {
            assertEquals(510510, new Problem69().getSolution());
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Test
    public void testCount() {
        try {
            assertEquals(12, (int) new Problem69().phicount(13));
            assertEquals(18, (int) new Problem69().phicount(54));
            assertEquals(32, (int) new Problem69().phicount(96));
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
}
