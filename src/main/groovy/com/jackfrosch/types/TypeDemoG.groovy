package com.jackfrosch.types;

class TypeDemoG {
    static void main(String[] args) {
        new TypeDemoG().showTypes()
    }

    private void showTypes() {
        int five = 5
        long fiveL = 5L
        float fiveF = 5.0f
        double fiveD = 5.0d
        def fiveOh = 5.0

        println "five instanceof Integer : ${five instanceof Integer}"
        println "fiveL instanceof Long : ${fiveL instanceof Long}"
        println "fiveF instanceof Float : ${fiveF instanceof Float}"
        println "fiveD instanceof Double : ${fiveD instanceof Double}"
        println "fiveOh.class.name : ${fiveOh.class.name}"

        int value = 5
        method(value)
    }

    private void method(long value) { println "${value} is an long" }

    private void method(Integer value) { println "${value} is an Integer" }
}
