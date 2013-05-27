package net.kibotu.projecteuler.solved;

import java.util.ArrayList;


/**
 * <p>SOLVED</p>
 * <p/>
 * <p>The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.</p>
 * <p/>
 * <p>Find the sum of all the primes below two million.</p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=41">Problem 41</a>
 */
public class Problem10 {

    public static void main(String[] args) {

        final ArrayList<Long> list = new ArrayList<Long>();
        list.add(0l);
        list.add(0l);
        Thread out = EulerUtils.getThread(list, 1000);
        out.start();

        boolean[] isPrime = new boolean[2000000];
        for (long i = 0; i < isPrime.length; i++) {
            isPrime[(int) i] = EulerUtils.isPrimeExtended(i);
            list.set(0, i);
        }

        long result = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                result += i;
            }
        }

        System.out.println("Sum: " + result);

        out.stop();
    }
}
