package com.printing.shop.order;

import com.printing.shop.common.OrderStatus;

import java.math.BigDecimal;
import java.util.List;

public record Order(String id, String customer, List<OrderLine> lines, OrderStatus status) {

    public static Order newOrder(String id, String customer) {
        throw new UnsupportedOperationException("TODO Person B: a PENDING order with no lines");
    }

    public BigDecimal total() {
        throw new UnsupportedOperationException("TODO Person B: add up the price of every line");
    }

    public Order withLine(OrderLine line) {
        throw new UnsupportedOperationException("TODO Person B: return a NEW Order with one more line");
    }

    public Order confirm() {
        throw new UnsupportedOperationException("TODO Person B: only from PENDING, else IllegalStateException(\"Only PENDING orders can be confirmed, ORD-001 is CONFIRMED\")");
    }

    public Order cancel() {
        throw new UnsupportedOperationException("TODO Person B: like confirm(), but to CANCELLED");
    }
}
