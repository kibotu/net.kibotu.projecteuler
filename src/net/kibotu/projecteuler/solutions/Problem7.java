package net.kibotu.projecteuler.solutions;

import net.kibotu.projecteuler.utils.IPrimes;
import net.kibotu.projecteuler.utils.PrimesSieve;

/**
 * @author Wolfgang
 * @note What is the 10001st prime number?
 */
public class Problem7 {

    /**
     * @param max what prime to get (ordinal)
     * @return the value of the nth prime
     */
    public long getPrime(int max) {
        long result = 0;
        IPrimes p = new PrimesSieve();
        // just count all the primes
        for (int count = 0; count < max; ++count)
            try {
                result = p.generatePrime(result);
            } catch (Exception e) {
            }
        return result;
    }
}
