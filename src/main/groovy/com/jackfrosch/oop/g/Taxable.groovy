package com.jackfrosch.oop.g

interface Taxable {
    BigDecimal calculateTax(BigDecimal taxRate)
    boolean isTaxable()
}
