package net.kibotu.projecteuler.solutions;

import junit.framework.TestCase;

public class Problem3Test extends TestCase {

    public void testPrimeFactor() {
        Problem3 p = new Problem3();
        long result = p.getLargestPrimeFactor(600851475143L);
        assertTrue(result == 6857);
    }
}
