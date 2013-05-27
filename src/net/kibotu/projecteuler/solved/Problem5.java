package net.kibotu.projecteuler.solved;

import java.util.ArrayList;


/**
 * <p>
 * SOLVED
 * </p>
 * <p/>
 * <p>
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * </p>
 * <p/>
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * </p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=5">Problem 5</a>
 */
public class Problem5 {

    public static void main(String[] args) {

        final ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            divisors.add(i);
        }

        boolean hasValidDivisor = false;
        int potentialNumber = 1;

        while (!hasValidDivisor) {

            for (Integer i : divisors) {
                hasValidDivisor = EulerUtils.gcd(potentialNumber, i) == i;
                if (!hasValidDivisor) {
                    System.out.println(potentialNumber + " " + i + "  = " + (EulerUtils.gcd(potentialNumber, i) == i));
                    break;
                }
            }

            potentialNumber++;
        }

        System.out.println("PotentialNumber" + (potentialNumber - 1));
    }
}
