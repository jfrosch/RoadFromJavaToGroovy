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
        println rpt
    }

    private String doSomething(String arg) {
        "doSomething(String)"
    }

    private String doSomething(Object arg) {
        "doSomething(Object)"
    }
}