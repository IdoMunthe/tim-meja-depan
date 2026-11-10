package com.printing.shop.app;

import com.printing.shop.order.OrderLineParser;
import com.printing.shop.product.ProductCatalog;
import com.printing.shop.report.OrderBook;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OrderDesk {

    private final ProductCatalog catalog;
    private final OrderBook book;
    private final PrintStream out;
    private final OrderLineParser parser = new OrderLineParser();
    private final List<String> rejected = new ArrayList<>();

    public OrderDesk(ProductCatalog catalog, OrderBook book, PrintStream out) {
        this.catalog = catalog;
        this.book = book;
        this.out = out;
    }

    public void loadOrders(Path file) throws IOException {
        throw new UnsupportedOperationException("TODO together (Part 2): read orders.csv line by line, see the starter-code slide");
    }

    public void runActions(Path file) throws IOException {
        throw new UnsupportedOperationException("TODO together (Part 2): apply CONFIRM and CANCEL from actions.txt");
    }

    public void printReport() {
        throw new UnsupportedOperationException("TODO together (Part 2): print the daily report, see the expected output");
    }

    public void saveReport(Path file) throws IOException {
        throw new UnsupportedOperationException("TODO bonus (Part 3): write the report to report.txt with a PrintWriter");
    }

    public static void main(String[] args) {
        Path dir = Path.of(args.length > 0 ? args[0] : "data");
        OrderDesk desk = new OrderDesk(ProductCatalog.standard(), new OrderBook(), System.out);
        try {
            desk.loadOrders(dir.resolve("orders.csv"));
            desk.runActions(dir.resolve("actions.txt"));
            desk.printReport();
        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + e.getFile());
        } catch (IOException e) {
            System.out.println("Could not read the input files: " + e.getMessage());
        }
    }
}
