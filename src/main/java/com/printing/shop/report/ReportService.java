package com.printing.shop.report;

import com.printing.shop.common.Finishing;
import com.printing.shop.common.OrderStatus;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReportService {

    private final OrderBook book;

    public ReportService(OrderBook book) {
        this.book = book;
    }

    public Map<OrderStatus, Integer> countByStatus() {
        throw new UnsupportedOperationException("TODO Person E: EnumMap with every status, 0 when there are none");
    }

    public Map<String, BigDecimal> revenueByProduct() {
        throw new UnsupportedOperationException("TODO Person E: TreeMap of CONFIRMED lines, summed with merge(...)");
    }

    public BigDecimal totalRevenue() {
        throw new UnsupportedOperationException("TODO Person E: add up the values of revenueByProduct()");
    }

    public List<Map.Entry<String, BigDecimal>> topCustomers(int n) {
        throw new UnsupportedOperationException("TODO Person E: total per customer (CONFIRMED only), highest first, at most n");
    }

    public Set<Finishing> finishingUsed() {
        throw new UnsupportedOperationException("TODO Person E: EnumSet of the finishing in CONFIRMED orders");
    }
}
