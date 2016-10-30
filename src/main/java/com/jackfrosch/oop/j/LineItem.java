package com.jackfrosch.oop.j;

import java.math.BigDecimal;

public class LineItem implements Taxable {
    private String productId;
    private BigDecimal price;
    private int quantity;
    private boolean taxable;

    public LineItem(String productId, BigDecimal price, int quantity, boolean taxable) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.taxable = taxable;
    }

    @Override
    public BigDecimal calculateTax(BigDecimal taxRate) {
        return getSaleAmount().multiply(taxRate);
    }

    @Override
    public boolean isTaxable() {
        return taxable;
    }

    public BigDecimal getSaleAmount() {
        return price.multiply(new BigDecimal(quantity));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LineItem lineItem = (LineItem) o;

        if (quantity != lineItem.quantity) return false;
        if (!productId.equals(lineItem.productId)) return false;
        return price.equals(lineItem.price);
    }

    @Override
    public int hashCode() {
        int result = productId.hashCode();
        result = 31 * result + price.hashCode();
        result = 17 * result + quantity;
        return result;
    }
    public String getProductId() {
        return productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public BigDecimal getPrice() {
        return price;
    }
}
