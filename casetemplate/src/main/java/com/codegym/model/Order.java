package com.codegym.model;

import com.codegym.utils.DateUtils;

import java.util.Date;
import java.util.List;

public class Order {
    private long id;
    private String fullName;
    private Date createAt;


    private double total;




    private List<OrderItem> orderItems;

    public Order(long id, String fullName, Date createAt, double total) {
        this.id = id;
        this.fullName = fullName;
        this.createAt = createAt;
        this.total = total;
    }

    public Order(long id, String fullName, Date createAt, double total, List<OrderItem> orderItems) {
        this.id = id;
        this.fullName = fullName;
        this.createAt = createAt;
        this.total = total;
        this.orderItems = orderItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void updateTotal() {
        double total = 0;
        for (int i = 0; i < orderItems.size(); i++) {
            total += orderItems.get(i).getPrice() * orderItems.get(i).getQuantity();
        }
        this.total = total;
    }
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Order() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    @Override
    public String toString() {
        //1681307110,Quang Dang,10-04-2023 14:16:30,25000
        return String.format("%s,%s,%s,%s", this.id, this.fullName, DateUtils.formatDate(this.createAt),
                this.total);
    }
}
