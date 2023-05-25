package com.ducminh.StyLash.service;

import com.ducminh.StyLash.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders();

    List<Order> getOrdersContainingText(String text);

    Order validateAndGetOrder(String id);

    Order saveOrder(Order order);

    void deleteOrder(Order order);
}
