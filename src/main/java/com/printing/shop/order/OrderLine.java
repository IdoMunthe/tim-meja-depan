package com.printing.shop.order;

import com.printing.shop.common.Finishing;

import java.math.BigDecimal;
import java.util.Set;

public record OrderLine(String productCode, int quantity, Set<Finishing> finishing, BigDecimal price) {
}
