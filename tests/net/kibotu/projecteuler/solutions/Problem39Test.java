package net.kibotu.projecteuler.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem39Test {

    @Test
    public void testRightAngle() {
        Problem39 p = new Problem39();
        assertTrue(p.isRightAngled(3, 4, 5));
        assertTrue(p.isRightAngled(20, 48, 52));
        assertTrue(p.isRightAngled(24, 45, 51));
        assertTrue(p.isRightAngled(30, 40, 50));
    }

    @Test
    public void testNumberOfTriangles() {
        Problem39 p = new Problem39();
        assertEquals(3, p.getNumberOfTriangles(120));
    }

    @Test
    public void getSolution() {
        Problem39 p = new Problem39();
        assertEquals(840, p.getSolution());
    }

}
