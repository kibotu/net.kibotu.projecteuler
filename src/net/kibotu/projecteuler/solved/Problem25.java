package net.kibotu.projecteuler.solved;


/**
 * <p>SOLVED</p>
 * <p/>
 * <p>The Fibonacci sequence is defined by the recurrence relation:</p>
 * <p/>
 * <p>Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.</p>
 * <p/>
 * <p>Hence the first 12 terms will be:</p>
 * <p>F1 = 1 <br />
 * F2 = 1 <br />
 * F3 = 2 <br />
 * F4 = 3 <br />
 * F5 = 5 <br />
 * F6 = 8 <br />
 * F7 = 13 <br />
 * F8 = 21 <br />
 * F9 = 34 <br />
 * F10 = 55 <br />
 * F11 = 89 <br />
 * F12 = 144</p>
 * <p/>
 * <p>The 12th term, F12, is the first term to contain three digits.</p>
 * <p/>
 * <p>What is the first term in the Fibonacci sequence to contain 1000 digits?</p>
 *
 * @author Kibotu
 * @see <a href="http://projecteuler.net/index.php?section=problems&id=25">Problem 25</a>
 */
public class Problem25 {

    public static void main(String[] args) {
        System.out.println(EulerUtils.getSumOfFibonnaciNumbers(1000));
    }
}
