package net.kibotu.projecteuler.solved;

/**
 * <p>
 * SOLVED
 * </p>
 * <p/>
 * <p>
 * The sum of the squares of the first ten natural numbers is,
 * </p>
 * <p/>
 * <p>
 * 12 + 22 + ... + 102 = 385
 * </p>
 * <p/>
 * <p>The square of the sum of the first ten natural numbers is,</p>
 * <p/>
 * <p>(1 + 2 + ... + 10)2 = 552 = 3025</p>
 * <p/>
 * <p>Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.</p>
 * <p/>
 * <p>Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.</p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=6">Problem 6</a>
 */
public class Problem6 {

    public static void main(String[] args) {

        final int maxNumber = 100;

        int sumOfSquares = getSumOfSquares(maxNumber);
        int squareOfSum = getSquareOfSum(maxNumber);

        System.out.println("Number: " + maxNumber);
        System.out.println("Square of Sum: " + squareOfSum);
        System.out.println("Sum of Squares: " + sumOfSquares);
        System.out.println("Difference: " + (sumOfSquares - squareOfSum));
    }

    private static int getSquareOfSum(int maxNumber) {
        int result = 0;
        for (int i = 1; i <= maxNumber; i++) {
            result += i * i;
        }
        return result;
    }

    private static int getSumOfSquares(int maxNumber) {
        return (1 + maxNumber) * (maxNumber / 2) * (1 + maxNumber) * (maxNumber / 2);
    }
}
