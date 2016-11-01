package com.jackfrosch.oop.j;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private String postalCode;
    private List<LineItem> items;

    public Order(String orderId, String postalCode) {
        this.orderId = orderId;
        this.postalCode = postalCode;
        items = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return orderId.equals(order.orderId);
    }

    @Override
    public int hashCode() {
        return orderId.hashCode();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void addLineItem(LineItem item) {
        items.add(item);
    }
}
