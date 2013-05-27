package net.kibotu.projecteuler.solved;

/**
 * <p>SOLVED</p>
 * <p/>
 * <p>If we list all the natural numbers below 10 that are multiples of 3
 * or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.</p>
 * <p/>
 * <p>Find the sum of all the multiples of 3 or 5 below 1000.</p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=1">Problem 1</a>
 */
public class Problem1 {

    private Problem1() {

    }

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 10000; i++) {

            if (i % 3 == 0 || i % 5 == 0) {

                sum += i;
            }
        }

        System.out.println(sum);
    }

}
