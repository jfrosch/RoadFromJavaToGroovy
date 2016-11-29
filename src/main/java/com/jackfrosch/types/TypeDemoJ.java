package com.jackfrosch.types;

public class TypeDemoJ {
    public static void main(String[] args) {
        new TypeDemoJ().showTypes();
    }

    private void showTypes() {
        int five = 5;
//        System.out.println("five instanceof Integer : " + (five instanceof Integer));
        method(five);
    }

    private void method(long value) {
        System.out.println(value + " is a long");
    }

    private void method(Integer value) {
        System.out.println(value + " is an Integer");
    }
}
