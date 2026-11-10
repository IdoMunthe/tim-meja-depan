package com.printing.shop.product;

import com.printing.shop.common.Finishing;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;

public abstract class PrintProduct {

    private final String code;
    private final BigDecimal unitPrice;

    protected PrintProduct(String code, BigDecimal unitPrice) {
        this.code = code;
        this.unitPrice = unitPrice;
    }

    public String code() {
        return code;
    }

    public final BigDecimal price(int quantity, Set<Finishing> finishing) {
        throw new UnsupportedOperationException("TODO Person A: check quantity 1..10000, add the price of each finishing per piece, multiply by quantity, apply the discount if this product is Discountable, round to whole rupiah");
    }

    protected abstract Map<Finishing, BigDecimal> finishingPrices();
}
