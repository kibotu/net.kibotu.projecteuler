package net.kibotu.projecteuler.solved;

import java.math.BigInteger;


/**
 * <p>SOLVED</p>
 * <p/>
 * <p>n! means n × (n − 1) × ... × 3 × 2 × 1</p>
 * <p/>
 * <p>For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,</p>
 * <p>and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.</p>
 * <p/>
 * <p>Find the sum of the digits in the number 100!</p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=20">Problem 20</a>
 */
public class Problem20 {

    public static void main(String[] args) {
        System.out.println("Sum: " + EulerUtils.sumDigits(EulerUtils.calcFact(100)));
    }

    /**
     * Computes the Factorial of a given Number. Recursive Approach.
     *
     * @param number
     * @return factorial number
     */
    public static BigInteger factorial(long number) {
        return fact(BigInteger.valueOf(number));
    }

    private static BigInteger fact(BigInteger n) {
        return (n.compareTo(BigInteger.ZERO) == 0) ? BigInteger.ONE : n.multiply(fact(n.subtract(BigInteger.ONE)));
    }
}