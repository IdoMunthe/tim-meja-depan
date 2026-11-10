package com.printing.shop.report;

import com.printing.shop.common.OrderStatus;
import com.printing.shop.order.Order;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class OrderBook {

    public void save(Order order) {
        throw new UnsupportedOperationException("TODO Person D: store the order by id, keep the order in which they were added");
    }

    public Optional<Order> find(String id) {
        throw new UnsupportedOperationException("TODO Person D: Optional.ofNullable(...)");
    }

    public Order get(String id) {
        throw new UnsupportedOperationException("TODO Person D: the order, or IllegalArgumentException(\"Order not found: \" + id)");
    }

    public Collection<Order> all() {
        throw new UnsupportedOperationException("TODO Person D: a copy of all orders");
    }

    public List<Order> byStatus(OrderStatus status) {
        throw new UnsupportedOperationException("TODO Person D: the orders with this status");
    }
}
