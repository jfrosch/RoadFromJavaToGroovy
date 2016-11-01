package com.jackfrosch.perf;

import java.util.Arrays;
import java.util.List;

class PerformanceDemoJ {

    public static void main(String[] args) {
        PerformanceDemoJ demo = new PerformanceDemoJ();

        System.out.println("fibonacci (ms): " + demo.measurePerformance(30L));
    }

    private List measurePerformance(long value) {
        long start = System.currentTimeMillis();
        long result = fibonacci(value);
        return Arrays.asList(result, System.currentTimeMillis() - start);
    }

    private long fibonacci(long val) {
        return val <= 1 ? val : fibonacci(val - 1) + fibonacci(val - 2);
    }
}
