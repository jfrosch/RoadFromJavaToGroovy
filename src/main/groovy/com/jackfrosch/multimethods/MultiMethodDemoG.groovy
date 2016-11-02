package com.jackfrosch.multimethods

class MultiMethodDemoG {
    static void main(String[] args) {
        new MultiMethodDemoG().drive()
    }

    private void drive() {
        Object obj = "Object"
        report("Groovy result passing Object: " + doSomething(obj))
    }

    private void report(String rpt) {
        System.out.println(rpt)
    }

    private String doSomething(String arg) {
        return "doSomething(String)"
    }

    private String doSomething(Object arg) {
        return "doSomething(Object)"
    }
}