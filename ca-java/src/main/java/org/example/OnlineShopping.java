package org.example;

import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    String category;
    double price;
    double rating;

    Product(String name, String category, double price, double rating) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }
}

public class OnlineShopping {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 45000, 4.5),
                new Product("Mobile", "Electronics", 15000, 4.2),
                new Product("Headphones", "Electronics", 3000, 4.6),
                new Product("Keyboard", "Electronics", 2500, 4.1),
                new Product("Monitor", "Electronics", 5000, 4.4),
                new Product("Laptop", "Electronics", 45000, 4.5),
                new Product("Mouse", "Electronics", 1000, 3.9),
                new Product("Tablet", "Electronics", 12000, 4.7),
                new Product("Camera", "Electronics", 50000, 4.8),
                new Product("Smartwatch", "Electronics", 5000, 4.3),
                new Product("Speaker", "Electronics", 4000, 4.5),
                new Product("Printer", "Electronics", 7000, 4.6)
        );

        List<String> result = products.stream()
                .filter(p -> p.rating > 4.0)
                .filter(p -> p.price <= 5000)
                .map(p -> p.name)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Result: " + result);


        List<String> optimizedResult = products.stream()
                .filter(p -> p.rating > 4.0 && p.price <= 5000)
                .map(p -> p.name.toUpperCase())
                .distinct()
                .sorted()
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Optimized Result: " + optimizedResult);
    }
}