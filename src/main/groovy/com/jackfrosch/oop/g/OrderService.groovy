package com.jackfrosch.oop.g

public class OrderService {

    BigDecimal[] calculateOrderTotal(Order order) {
        List<LineItem> items = order.items

        // Closure coerced into acting as a BinaryOperator<BigDecimal> functional interface
        BigDecimal subtotal = items.stream()
                               .map({ lineItem -> lineItem.saleAmount })
                               .reduce(0.00, { sum, addend -> sum + addend } )

        BigDecimal taxRate = findTaxRate(order.getPostalCode())

        // Using Groovy idioms instead of Java 8 streams even works with JDK 1.6!
        BigDecimal tax = items.findAll { it.taxable }
                              .collect {it.saleAmount }
                              .inject(0.00, { sum, saleAmount -> sum + saleAmount * taxRate } )

        [ subtotal, tax, subtotal.add(tax) ]
    }
    // Simulate finding tax rate
    private BigDecimal findTaxRate(String postalCode) {
        0.05
    }
}
