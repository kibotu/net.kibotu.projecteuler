package net.kibotu.projecteuler.solutions;

import junit.framework.TestCase;

import java.math.BigInteger;

public class Problem20Test extends TestCase {

    public void testFactorials() {
        Problem20 p = new Problem20();
        assertEquals(new BigInteger("6"), p.getFactorial(3));
    }

    public void testFactorialSum() {
        Problem20 p = new Problem20();
        assertEquals(648, p.getFactorialSum(100));
    }
}
