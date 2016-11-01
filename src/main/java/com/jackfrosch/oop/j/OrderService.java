package com.jackfrosch.oop.j;

import java.math.BigDecimal;
import java.util.List;

public class OrderService {

    public BigDecimal[] calculateOrderTotal(Order order) {
        List<LineItem> items = order.getItems();

        BigDecimal subtotal = items.stream()
                               .map(LineItem::getSaleAmount)
                               .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal taxRate = findTaxRate(order.getPostalCode());
        BigDecimal tax = items.stream()
                            .filter(LineItem::isTaxable)
                            .map(LineItem::getSaleAmount)
                            .reduce(BigDecimal.ZERO,
                                    (sum, saleAmount) -> sum.add(saleAmount.multiply(taxRate)));

        return new BigDecimal[] { subtotal, tax, subtotal.add(tax) };
    }
    // Simulate finding tax rate
    private BigDecimal findTaxRate(String postalCode) {
        return new BigDecimal("0.05");
    }
}
