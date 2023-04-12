package com.codegym.service;

import com.codegym.model.OrderItem;

import java.util.List;

public interface IOrderItemService {
    List<OrderItem> getOrderItemsByOrderId(long idOrder);

    List<OrderItem> getAll();

    void addOrderItems(List<OrderItem> orderItems);
}
