package com.jackfrosch.oop.g

class OrderApp {
    static void main(String[] args) {
        new OrderApp().processOrder()
    }

    private void processOrder() {
        Order order = createOrder()
        BigDecimal[] totals = new OrderService().calculateOrderTotal(order)
        report(order, totals)
    }

    private Order createOrder() {
        Order order = new Order("Test1", "99999-1234")
        order << new LineItem("Prod_A", 10.00, 1, true)
        order << new LineItem("Prod_B", 15.00, 2, false)
        order << new LineItem("Prod_C", 20.00, 3, true)
        return order
    }

    private void report(Order order, BigDecimal[] totals) {
        totals.eachWithIndex { BigDecimal entry, int i ->
            totals[i] = totals[i].setScale(2, BigDecimal.ROUND_HALF_UP)
        }
        println(buildReport(order, totals))
    }

    String buildReport(Order order, BigDecimal[] totals) {
"""
--------------------
Order id: ${order.orderId}
--------------------
Subtotal: ${totals[0]}
Tax: ${totals[1]}
Total: ${totals[2]}
"""
    }
}
