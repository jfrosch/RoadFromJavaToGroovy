package com.jackfrosch.perf

import groovy.transform.CompileStatic

class PerformanceDemoG {

    static void main(String[] args) {
        PerformanceDemoG demo = new PerformanceDemoG()

        println "fastFibonacci (ms): ${demo.measurePerformance(demo.&fastFibonacci, 30L)}"
        println "slowFibonacci (ms): ${demo.measurePerformance(demo.&slowFibonacci, 30L)}"
    }

    private List measurePerformance(def method, long value) {
        long start = System.currentTimeMillis()
        long result = method(value)
        [result, System.currentTimeMillis() - start]
    }

    int slowFibonacci(long val) {
        val <= 1L ? val : slowFibonacci(val - 2) + slowFibonacci(val - 1)
    }

    @CompileStatic
    int fastFibonacci(long val) {
        val <= 1L ? val : fastFibonacci(val - 2) + fastFibonacci(val - 1)
    }
}
