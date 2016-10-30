package com.jackfrosch.oop.g

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode

@Canonical
@EqualsAndHashCode(includes = 'orderId')
public class Order {
    String orderId
    String postalCode
    List<LineItem> items = []

    Order leftShift(LineItem item) {
        items.add(item)
        this
    }
}
