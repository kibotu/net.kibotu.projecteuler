package net.kibotu.projecteuler.utils;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class SolutionNotFoundExceptionTest {
    @Test
    public void testException () {
        try {
            throw new SolutionNotFoundException( SolutionNotFoundExceptionTest.class );
        } catch ( SolutionNotFoundException ex ) {
            assertTrue( ex.toString().equals("") );
        } catch ( Exception ex ) {
            fail( ex.toString() );
        }
    }
}
