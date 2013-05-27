package net.kibotu.projecteuler.solved;

import java.util.ArrayList;


/**
 * <p>
 * SOLVED
 * </p>
 * <p/>
 * <p>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * </p>
 * <p/>
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 * </p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=3">Problem 3</a>
 */
public class Problem3 {

    public static final long MAXNUMBER = 317584931803l;

    // 600851475143l

    public static void main(String[] args) {

        // old primes
        final ArrayList<Long> divisors = new ArrayList<Long>();

        Long number = MAXNUMBER;
        Long max = 0l;

        for (long x = 2l; (x * x) <= number; x++) {
            if ((number % x) == 0) {
                divisors.add(x);
                if (EulerUtils.isPrime(x)) {
                    if (x > max) {
                        max = x;
                    }
                }
            }
        }

        System.out.println(divisors);
        System.out.println("Biggest Prime Number Divisor: " + max);
    }
}
