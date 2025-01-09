package com.epam.functional.programming.streamsapi;

import java.util.Arrays;
import java.util.List;

public class OrderData {

    public static List<Order> getOrderDetails(){
        Order order1 = new Order("ELECTRONICS", "Iphone", 48000, 2);
        Order order2 = new Order("ELECTRONICS", "MacBook", 150000, 1);
        Order order3 = new Order("ELECTRONICS", "Sony Video Projector", 425000, 4);

        Order order4 = new Order("WOMEN-FASHION", "Fast-Track Watch", 10000, 2);
        Order order5 = new Order("WOMEN-FASHION", "Leather HandBag", 2500, 1);

        Order order6 = new Order("MEN-FASHION", "T-Shirt", 5000, 5);
        Order order7 = new Order("MEN-FASHION", "Reebok Shoes", 7000, 2);
        Order order8 = new Order("MEN-FASHION", "Titan Watch", 4800, 1);

        Order order9 = new Order("BABY", "HeadBands", 200, 4);
        Order order10 = new Order("BABY", "Baby SunGlasses", 1200, 6);
        Order order11 = new Order("BABY", "Baby SunGlasses", 4200, 4);
        Order order12 = new Order("BABY", "E-Learn Baby Toys", 19000, 11);
        Order order13 = new Order("BABY", "Montessori Toys", 8900, 2);

        Order order14 = new Order("E-LEARN", "Clean Code Principles", 1100, 1);
        Order order15 = new Order("E-LEARN", "Microservices", 2300, 2);
        Order order16 = new Order("E-LEARN", "Design Patterns", 850, 1);

        return Arrays.asList(order1, order2, order3, order4, order5, order6, order7, order8,
                order9, order10, order11, order12, order13, order14, order15, order16);
    }
}