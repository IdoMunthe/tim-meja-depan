package com.printing.shop.product;

import java.math.BigDecimal;

public interface Discountable {

    int minimumQuantity();

    BigDecimal discountRate();

    default BigDecimal applyDiscount(int quantity, BigDecimal total) {
        throw new UnsupportedOperationException("TODO Person A: below minimumQuantity() return total, otherwise total minus discountRate()");
    }
}
