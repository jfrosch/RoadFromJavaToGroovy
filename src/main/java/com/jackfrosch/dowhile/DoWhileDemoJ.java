package com.jackfrosch.dowhile;

import java.util.ArrayList;
import java.util.List;

public class DoWhileDemoJ {
    private static final int NUM_PRIMES = 100000;

    List<Integer> primes = new ArrayList<>();

    public static void main(String[] args) {
        new DoWhileDemoJ().findPrimes(NUM_PRIMES);
    }

    private void findPrimes(int limit) {
        long start = System.currentTimeMillis();

        primes.add(2);
        primes.add(3);

        int candidate = 5;
        while(primes.size() <= limit) {
            if(isPrime(candidate)) {
                primes.add(candidate);
            }
            candidate += 2;
        }

        long stop = System.currentTimeMillis();
        //System.out.println(primes);
        System.out.println("Time for Java to find " + NUM_PRIMES +
                            " primes: " + (stop - start) + "ms");
    }

    private boolean isPrime(int candidate) {
        if(candidate % 2 == 0 && candidate > 1) {
            return false;
        }

        boolean prime;
        int divisorIndex = 1;
        int divisor;
        do {
            divisor = primes.get(divisorIndex++);
            prime = candidate % divisor != 0;
        } while(prime && divisor <= Math.sqrt(candidate));

        return prime;
    }
}
