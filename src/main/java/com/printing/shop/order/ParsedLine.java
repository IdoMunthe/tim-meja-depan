package com.printing.shop.order;

import com.printing.shop.common.Finishing;

import java.util.Set;

public record ParsedLine(int lineNo, String orderId, String customer, String productCode,
                         int quantity, Set<Finishing> finishing) {
}
