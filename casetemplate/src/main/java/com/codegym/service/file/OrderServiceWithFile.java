package com.codegym.service.file;

import com.codegym.model.Order;
import com.codegym.model.OrderItem;
import com.codegym.service.IOrderItemService;
import com.codegym.service.IOrderService;
import com.codegym.utils.FileUtils;

import java.util.List;

public class OrderServiceWithFile implements IOrderService {
    private final String pathOrder = "./data/order.csv";
    private IOrderItemService iOrderItemService;

    public OrderServiceWithFile() {
        iOrderItemService = new OrderItemServiceWithFile();
    }

    @Override
    public List<Order> getAll() {
        List<Order> orders = FileUtils.readDataFromFile("./data/order.csv", FileUtils.CLASS_ORDER);

        for (int i = 0; i < orders.size(); i++) {
            List<OrderItem> orderItemsById = iOrderItemService.getOrderItemsByOrderId(orders.get(i).getId());
            orders.get(i).setOrderItems(orderItemsById);
        }
        return orders;
    }

    @Override
    public Order findOrderById(long idOrder) {
        List<Order> orders = getAll();

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == idOrder) {
                return orders.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateOrderById(long id, Order order) {

    }

    @Override
    public void deleteOrderById(long id) {

    }

    @Override
    public void addOrder(Order order) {
        List<Order> orders = getAll();
        orders.add(order);

        FileUtils.writeDateToFile(pathOrder, orders);
        iOrderItemService.addOrderItems(order.getOrderItems());
    }
}
