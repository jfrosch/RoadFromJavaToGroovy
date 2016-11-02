package com.jackfrosch.truth;

public class TruthService {
    public void echo(Object clientValue, boolean value) {
        System.out.print(clientValue);
        System.out.println(" sent as boolean value: " + value);
    }
}
