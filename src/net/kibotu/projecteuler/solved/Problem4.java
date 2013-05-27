package net.kibotu.projecteuler.solved;

import java.util.ArrayList;


/**
 * <p>SOLVED</p>
 * <p/>
 * <p>A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.</p>
 * <p/>
 * <p>Find the largest palindrome made from the product of two 3-digit numbers.</p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=4">Problem 4</a>
 */
public class Problem4 {

    public static final String PALINDROME_FILE_PATH = "src/files/palindrome.txt";

    public static void main(String[] args) {
        ArrayList<Long> list = EulerUtils.computePalindrom(100, 1000);
        EulerUtils.save(list, PALINDROME_FILE_PATH);
        System.out.println("Largest Palindrom: " + EulerUtils.findLargestNumber(list));
    }
}
