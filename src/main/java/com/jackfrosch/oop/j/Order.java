package com.jackfrosch.oop.j;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderid;
    private String postalCode;
    private List<LineItem> items;

    public Order(String postalCode, String orderId) {
        this.postalCode = postalCode;
        this.orderid = orderId;
        items = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return orderid.equals(order.orderid);
    }

    @Override
    public int hashCode() {
        return orderid.hashCode();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getOrderid() {
        return orderid;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public void addLineItem(LineItem item) {
        items.add(item);
    }
}
