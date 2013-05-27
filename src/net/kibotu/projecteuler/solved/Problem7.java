package net.kibotu.projecteuler.solved;

import java.util.ArrayList;


/**
 * <p>SOLVED</p>
 * <p/>
 * <p>By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.</p>
 * <p/>
 * <p>What is the 10 001st prime number?</p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=7">Problem 7</a>
 */
public class Problem7 {

    public static final String PRIMES_FILE_PATH = "src/files/primes.txt";
    public static final long MAXNUMBER = 200000;
    // 600851475143l

    public static void main(String[] args) {

        // old primes
        final ArrayList<Long> pastPrimes = EulerUtils.load(PRIMES_FILE_PATH);

        Thread out = new Thread(new Runnable() {
            public void run() {
                while (true) {

                    synchronized (pastPrimes) {
                        System.out.println(pastPrimes.size());
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        out.start();

        // last prime in list
        long lastMaxPrim = pastPrimes.isEmpty() ? 2 : pastPrimes.get(pastPrimes.size() - 1);

        // add new range that needs to be checked
        pastPrimes.addAll(getList(lastMaxPrim + 1, MAXNUMBER));

        // actuall check
        for (int i = 0; i < pastPrimes.size(); i++) {
            filterDivisor(pastPrimes.get(i), pastPrimes);
        }

        // print 10001st prime number
        for (int i = 0; i < pastPrimes.size(); i++) {
            if (i == 10000) {
                System.out.println((i + 1) + ". " + pastPrimes.get(i));
                break;
            }
        }

        // save only if there is a new prime number
        if (lastMaxPrim != pastPrimes.get(pastPrimes.size() - 1)) {
            EulerUtils.save(pastPrimes, PRIMES_FILE_PATH);
        }

        out.stop();
    }

    /**
     * Filter all numbers that have <code>number</code> as divisor.
     *
     * @param divisor
     * @param numbers
     */
    private static void filterDivisor(Long number, ArrayList<Long> numbers) {
        ArrayList<Long> toRemove = new ArrayList<Long>();

        for (int i = 0; i < numbers.size(); i++) {

            long temp = numbers.get(i);

            if (temp % number == 0 && temp != number) {
                toRemove.add(temp);
            }
        }
        numbers.removeAll(toRemove);
    }

    /**
     * Build a new list of integer in a certain range.
     *
     * @param start
     * @param d
     * @return list of integer within a range
     */
    public static ArrayList<Long> getList(long start, long end) {
        ArrayList<Long> list = new ArrayList<Long>();
        for (long i = start; i < end; i++) {
            list.add(i);
        }
        return list;
    }
}
