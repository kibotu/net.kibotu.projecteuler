package net.kibotu.projecteuler.utils;

public interface IPrimes {

    abstract public long generatePrime(long start) throws Exception;

    abstract public long generatePreviousPrime(long start) throws Exception;

    abstract public boolean isPrime(long n);

}
