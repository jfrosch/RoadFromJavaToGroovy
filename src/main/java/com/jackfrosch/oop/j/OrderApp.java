package com.jackfrosch.oop.j;

import java.math.BigDecimal;

public class OrderApp {
    public static void main(String[] args) {
        new OrderApp().processOrder();
    }

    private void processOrder() {
        Order order = createOrder();
        BigDecimal[] totals = new OrderService().calculateOrderTotal(order);
        report(order, totals);
    }

    private Order createOrder() {
        Order order = new Order("Test1", "99999-1234");
        order.addLineItem(new LineItem("Prod_A", new BigDecimal("10.00"), 1, true));
        order.addLineItem(new LineItem("Prod_B", new BigDecimal("15.00"), 2, false));
        order.addLineItem(new LineItem("Prod_C", new BigDecimal("20.00"), 3, true));
        return order;
    }

    private void report(Order order, BigDecimal[] totals) {
        for(int i = 0; i < totals.length; i++) {
            totals[i] = totals[i].setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        System.out.println(buildReport(order, totals));
    }

    private String buildReport(Order order, BigDecimal[] totals) {
        String decorator = "\n--------------------";
        return decorator +
                "\nOrder id: " + order.getOrderid() +
                decorator +
                "\nSubtotal: " + totals[0] +
                "\nTax: " + totals[1] +
                "\nTotal: " + totals[2];
    }
}
