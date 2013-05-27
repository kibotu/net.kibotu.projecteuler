package net.kibotu.projecteuler.solved;

import java.io.PrintWriter;

/**
 * <p>SOLVED</p>
 * <p/>
 * <p>A Pythagorean triplet is a set of three natural numbers, a < b < c,
 * for which, a^(2) + b^(2) = c^(2)</p>
 * <p/>
 * <p>For example, 3^(2) + 4^(2) = 9 + 16 = 25 = 5^(2).</p>
 * <p/>
 * <p>There exists exactly one Pythagorean triplet for which a + b + c =
 * 1000. Find the product abc.</p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=9">Problem 9</a>
 */
public class Problem9 {

    private Problem9() {

    }

    final static PrintWriter cout = new PrintWriter(System.out, true);

    public static void main(String[] args) {

        int summe = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        for (c = 1000; c > 0; c--) {

            for (b = (1000 - c); b > a; b--) {

                a = (1000 - c) - b;

                summe = c + a + b;
                if (summe == 1000 && a < b && b < c) {

                    int pyt = a * a + b * b;
                    if (pyt == (c * c)) {
                        cout.println(summe + " = " + a + " + " + b + " + " + c);
                    }

                }

            }

        }

        cout.println(200 * 375 * 425);
    }
}
