package com.jackfrosch.oop.g

import groovy.transform.Canonical

@Canonical
class LineItem implements Taxable {
    String productId
    BigDecimal price
    int quantity
    boolean taxable

    @Override
    BigDecimal calculateTax(BigDecimal taxRate) {
        return getSaleAmount().multiply(taxRate)
    }

    @Override
    boolean isTaxable() {
        return taxable
    }

    BigDecimal getSaleAmount() {
         price * quantity
    }
}
