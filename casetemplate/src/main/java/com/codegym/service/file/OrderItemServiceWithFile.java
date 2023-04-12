package com.codegym.service.file;

import com.codegym.model.OrderItem;
import com.codegym.service.IOrderItemService;
import com.codegym.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class OrderItemServiceWithFile implements IOrderItemService {
    private final String pathOrderItem ="./data/orderitem.csv";


    @Override
    public List<OrderItem> getOrderItemsByOrderId(long idOrder) {

        List<OrderItem> orderItems = FileUtils.readDataFromFile(pathOrderItem, FileUtils.CLASS_ORDER_ITEM);

        List<OrderItem> results = new ArrayList<>();
        for (int i = 0; i < orderItems.size(); i++) {
            if (orderItems.get(i).getIdOrder() == idOrder) {
                results.add(orderItems.get(i));
            }
        }

        return results;
    }

    @Override
    public List<OrderItem> getAll() {
        return FileUtils.readDataFromFile(pathOrderItem, FileUtils.CLASS_ORDER_ITEM);
    }

    @Override
    public void addOrderItems(List<OrderItem> orderItems) {
        List<OrderItem> datas = getAll();

        datas.addAll(orderItems);


        FileUtils.writeDateToFile(pathOrderItem, datas);
    }
}
