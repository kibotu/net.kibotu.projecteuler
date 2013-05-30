package net.kibotu.projecteuler.solved;

import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 *
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=16">Problem 16</a>
 */
public class Problem16 {

    public static void main(String[] args) {

        // create a BigInteger of 2 and power to the specified exponent
        BigInteger square =  BigInteger.valueOf(2);
        square = square.pow(1000);

        // for each digit in the result => add them
        int result = 0;
        char[] ca = square.toString().toCharArray();
        for (char c : ca)
            result += c - '0';


        System.out.println(result);
    }
}
