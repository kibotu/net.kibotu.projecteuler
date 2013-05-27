package net.kibotu.projecteuler.solutions;

import net.kibotu.projecteuler.utils.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Problem66Test {
    @Test
    public void testMin() {
        try {
            assertEquals(new Fraction(3, 2), new Problem66().findMin(2));
            assertEquals(new Fraction(649, 180), new Problem66().findMin(13));
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }

    @Test
    public void testSolution() {
        try {
            assertEquals(661, new Problem66().getSolution());
        } catch (Exception ex) {
            fail(ex.toString());
        }
    }
}
