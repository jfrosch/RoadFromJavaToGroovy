package com.jackfrosch.dowhile

import groovy.transform.CompileStatic

@CompileStatic
public class DoWhileDemoG {
    private static final int NUM_PRIMES = 100000

    List<Integer> primes = []

    public static void main(String[] args) {
        new DoWhileDemoG().findPrimes(NUM_PRIMES)
    }

    private void findPrimes(int limit) {
        long start = System.currentTimeMillis()
        primes.add(2)
        primes.add(3)

        int candidate = 5
        while(primes.size() <= limit) {
            if(isPrime(candidate)) {
                primes.add(candidate)
            }
            candidate += 2
        }

        long stop = System.currentTimeMillis()
        // println(primes)
        println("Time for Groovy to find ${NUM_PRIMES} primes: ${stop - start}ms")
    }

    private boolean isPrime(int candidate) {
        if(candidate % 2 == 0 && candidate > 1) {
            return false
        }

        boolean prime = false
        int divisorIndex = 1
        int divisor

        boolean loop = true
        while(loop) {
            divisor = primes[divisorIndex++]
            prime = candidate % divisor != 0
            loop = prime && divisor <= Math.sqrt(candidate)
        }

        return prime
    }
}
