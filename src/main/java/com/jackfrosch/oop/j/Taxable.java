package com.jackfrosch.oop.j;

import java.math.BigDecimal;

interface Taxable {
    BigDecimal calculateTax(BigDecimal taxRate);
    boolean isTaxable();
}
