package com.jackfrosch.types;

public class TypeDemoJ {
    public static void main(String[] args) {
        new TypeDemoJ().showTypes();
    }

    private void showTypes() {
        Object fiveOh = 5.0;

        System.out.println("fiveOh instanceof Double : " + (fiveOh instanceof Double));

        int value = 5;
        method(value);
    }

    private void method(long value) {
        System.out.println(value + " is an long");
    }

    private void method(Integer value) {
        System.out.println(value + " is an Integer");
    }
}
