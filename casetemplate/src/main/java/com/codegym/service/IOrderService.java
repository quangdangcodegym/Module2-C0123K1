package com.codegym.service;


import com.codegym.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getAll();

    Order findOrderById(long idOrder);
    void updateOrderById(long id, Order order);
    void deleteOrderById(long id);

    void addOrder(Order order);
}
