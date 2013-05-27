package net.kibotu.projecteuler.utils;

import junit.framework.TestCase;

public class BigIntTest extends TestCase {

    public void testAddition () {
        BigInt i1 = new BigInt("");
        BigInt i2 = new BigInt("");

        BigInt result = i1.add( i2 );
        assertEquals( result, "");

        result = i1.add( new BigInt("") );
        assertEquals( result, "");

        result = i1.add( new BigInt("") );
        assertEquals( result, "");

        result = i1.add( new BigInt("") );
        assertEquals( result, "");

        result = new BigInt("").add( new BigInt("") );
        assertEquals( result, "");

        result = new BigInt("").add( new BigInt("") );
        assertEquals( result, "");

        result = new BigInt("").add( new BigInt("") );
        assertEquals( result, "");
    }

}
