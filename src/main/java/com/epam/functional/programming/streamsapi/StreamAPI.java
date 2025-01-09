package com.epam.functional.programming.streamsapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Order> orders = OrderData.getOrderDetails();

        // Predicate
        List<Order> electronicItems = orders.stream()
                .filter(order -> {
                        return order.getCategory().equals("ELECTRONICS");
                })
                .toList();
        System.out.println(electronicItems);
        // Function - map() will create new Stream and copy the data and return it
        List<Order> productsWithCapitalNamesMap = orders.stream()
                .map(order -> {
                        Order modifiedOrder = new Order();
                        modifiedOrder.setProduct(order.getProduct().toUpperCase());
                        modifiedOrder.setCategory(order.getCategory());
                        modifiedOrder.setPrice(order.getPrice());
                        modifiedOrder.setQuantity(order.getQuantity());
                        return modifiedOrder;
                })
                .toList();
        System.out.println(productsWithCapitalNamesMap);
        // peek() will not create new Stream instead it will modify the items in existing stream of data
        List<Order> productsWithCapitalNamesPeek = orders.stream()
                .peek(order -> {
                    order.setProduct(order.getProduct().toUpperCase());
                })
                .toList();
        System.out.println(productsWithCapitalNamesPeek);

        //Consumer
        orders.stream()
                .peek(order -> {
                    order.setProduct(order.getProduct().toUpperCase());
                })
                .forEach(order ->  {
                        System.out.println(order);
                });

        // Sort the orders by price
        System.out.println("*****************************************Sorting Orders by price in Ascending order*****************************************");
        orders.stream()
                .sorted(Comparator.comparing(order -> order.getPrice()))
                .forEach(order -> System.out.println(order));

        // Grouping -> I need to find the number of products belonging to a certain category
        System.out.println("*****************************************Grouping Number Of Products By Category*****************************************");
        Map<String, Long> categoriesWithProductsCount = orders.stream()
                .collect(Collectors.groupingBy(order -> order.getCategory(), Collectors.counting()));

        System.out.println(categoriesWithProductsCount);

        // Grouping with Mapping
        System.out.println("*****************************************Grouping Products with Category*****************************************");
        Map<String, List<String>> mapOfProductsWithCategory = orders.stream()
                //.filter(order -> order.getCategory().equals("ELECTRONICS"))
                .collect(Collectors.groupingBy(order -> order.getCategory(),
                        Collectors.mapping(order-> order.getProduct(), Collectors.toList())));

        System.out.println(mapOfProductsWithCategory);
    }
}