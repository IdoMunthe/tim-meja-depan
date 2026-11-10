package com.printing.shop.product;

import java.util.List;

public class ProductCatalog {

    public ProductCatalog(List<PrintProduct> all) {
        throw new UnsupportedOperationException("TODO Person A: keep the products in a Map by code()");
    }

    public static ProductCatalog standard() {
        throw new UnsupportedOperationException("TODO Person A: create BusinessCard, Poster and Banner, then return new ProductCatalog(List.of(...))");
    }

    public PrintProduct find(String code) {
        throw new UnsupportedOperationException("TODO Person A: return the product, or throw IllegalArgumentException(\"unknown product \" + code)");
    }
}
