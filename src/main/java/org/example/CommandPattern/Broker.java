package org.example.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by will on 16-12-20.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for(Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
