package net.kibotu.projecteuler.utils;

import org.junit.Test;

import static org.junit.Assert.*;


public class PrimesTest {

    @Test
    public void testPrimeSimple () {
        IPrimes p = new Primes();
        try {
            assertEquals( 2L, p.generatePrime( 0L ) );
            assertEquals( 2L, p.generatePrime( 1L ) );
            assertEquals( 3L, p.generatePrime( 2L ) );
            assertEquals( 13L, p.generatePrime( 11L ) );
            assertEquals( 193939L, p.generatePrime( 193938L ) );
        } catch ( Exception e ) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testIsPrimeAtkins () {
        try {
            IPrimes p = new Primes( 5000000 );
            assertFalse( p.isPrime( 15 ) );
            assertFalse( p.isPrime( 121 ) );
            assertTrue( p.isPrime( 2 ) );
            assertFalse( p.isPrime( 4 ) );
            assertTrue( p.isPrime( 5 ) );
            assertTrue( p.isPrime( 13 ) );
            assertTrue( p.isPrime( 113 ) );
            assertTrue( p.isPrime( 179 ) );
            assertFalse( p.isPrime( 81 ) );
            assertFalse( p.isPrime( 371197 ) );
            assertTrue( p.isPrime( 193939 ) );
            assertTrue( p.isPrime( 4193939 ) );
        } catch ( Exception e ) {
            fail();
        }
    }
}
