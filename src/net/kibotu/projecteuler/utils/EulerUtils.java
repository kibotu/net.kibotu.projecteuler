package net.kibotu.projecteuler.utils;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

final public class EulerUtils {

    private static ArrayList<BigInteger> fibCache = new ArrayList<BigInteger>();

    static {
        fibCache.add(BigInteger.ZERO);
        fibCache.add(BigInteger.ONE);
    }

    public static BigInteger getFibonacciBigInteger(int n) {
        if (n >= fibCache.size()) {
            fibCache.add(n, getFibonacciBigInteger(n - 1).add(getFibonacciBigInteger(n - 2)));
        }
        return fibCache.get(n);
    }

    // static
    private EulerUtils() {
    }

    /**
     * Fibonacci Berechnung use: long fib = getFibonacci(x)[1]
     *
     * @return long[]
     */
    public static long[] getFibonacci(int n) {

        long[] t = new long[2];
        if (n == 0) {
            t[0] = 0;
            t[1] = 1;
            return t;
        }
        long[] temp = getFibonacci(n - 1);
        t[0] = temp[1];
        t[1] = temp[0] + temp[1];

        return t;
    }

    /**
     * Save list of integers to a file.
     *
     * @param list
     * @param filepath
     */
    public static void save(ArrayList<Long> list, String filepath) {
        PrintWriter fout = null;
        try {
            fout = new PrintWriter(new BufferedWriter(new FileWriter(filepath)));
            for (Long i = (long) 1; i < list.size() + 1; i++) {
                fout.printf("%-10d ", list.get((int) (i - 1)));
                if (i % 10 == 0) {
                    fout.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fout.close();
        }
    }

    /**
     * Determes if a given Number is a prime number.
     *
     * @param number
     * @return <code>true</code> if is prime
     */
    public static boolean isPrime(Long number) {
        Long i = 0l;
        boolean isPrime = true;

        if (number != 1) {
            for (i = 2l; i <= (number / 2); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
        } else {
            isPrime = false;
        }
        return isPrime;
    }

    /**
     * Finds out if given Number is prime.
     *
     * @return <code>true</code> if is prime
     */
    public static boolean isPrimeExtended(long n) {

        if (n < 3) {
            return n == 2;
        } else if (n % 2 == 0) {
            return false;
        } else {
            long sqrt = (long) (Math.sqrt(n) + 1);
            for (long i = 3; i < sqrt; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Computes Factorial of a given Number. Non-Recursive Approach.
     *
     * @param number
     * @return factorial number
     */
    public static String calcFact(int number) {
        BigInteger bi = new BigInteger("1");
        for (int i = 2; i < number; i++) {
            bi = bi.multiply(new BigInteger("" + i));
        }
        return bi.toString(10);
    }

    /**
     * Computes the sum of digits of a number within a given String.
     *
     * @param digits
     * @return sum of digits
     */
    public static int sumDigits(String digits) {
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            sum = sum + Integer.parseInt("" + digits.charAt(i));
        }
        return sum;
    }

    /**
     * Computes sum of digits for a fibonacci number.
     *
     * @return
     */
    public static int getSumOfFibonnaciNumbers(int maxNumber) {
        BigInteger[] number = new BigInteger[3];
        number[0] = BigInteger.ONE;
        number[1] = BigInteger.ONE;
        int index = 1;
        int count = 2;
        while (number[index].toString().length() < maxNumber) {
            index = (index + 1) % 3;
            number[index] = number[(index + 2) % 3].add(number[(index + 1) % 3]);
            count++;
        }
        return count;
    }

    public static ArrayList<Long> computePalindrom(int startRange, int endRange) {
        ArrayList<Long> result = new ArrayList<Long>();
        for (int i = endRange; i >= startRange; --i) {
            for (int j = endRange; j >= startRange; --j) {
                if (isPalindrom(i * j)) {
                    result.add((long) (i * j));
                }
            }
        }
        return result;
    }

    public static boolean isPalindrom(long number) {
        String s = "" + number;
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return s.equals(result);
    }

    public static long findLargestNumber(ArrayList<Long> list) {
        long max = 0;
        for (Long i : list) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Return the greatest common divisor
     */
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    /**
     * Load a list of integer from file.
     *
     * @param filepath
     * @return list
     */
    public static ArrayList<Long> load(String filepath) {
        Scanner fin = null;
        ArrayList<Long> list = new ArrayList<Long>();
        try {
            fin = new Scanner(new BufferedReader(new FileReader(filepath)));
            while (fin.hasNext()) {
                if (fin.hasNextLong()) {
                    list.add(fin.nextLong());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fin.close();
        }
        return list;
    }

    public static Thread getThread(final List<?> list, final int interval) {
        return new Thread(new Runnable() {
            public void run() {
                while (true) {
                    synchronized (list) {
//						System.out.println(list.size());	
                        System.out.println(list.get(0));
                    }
                    try {
                        Thread.sleep(interval);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
