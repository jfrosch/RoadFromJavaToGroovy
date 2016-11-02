package com.jackfrosch.multimethods;

public class MultiMethodDemoJ {
    public static void main(String[] args) {
        new MultiMethodDemoJ().drive();
    }

    private void drive() {
        Object obj = "Object";
        report("Java result passing Object: " + doSomething(obj));
    }

    private void report(String rpt) {
        System.out.println(rpt);
    }

    private String doSomething(String arg) {
        return "doSomething(String)";
    }

    private String doSomething(Object arg) {
        return "doSomething(Object)";
    }
}
