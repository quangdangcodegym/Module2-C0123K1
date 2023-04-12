package com.codegym.model;

public class OrderItem {
    private long id;


    private long idOrder;
    private long idBook;
    private int quantity;
    private double price;


    public OrderItem(long id, long idOrder, long idBook, int quantity, double price) {
        this.id = id;
        this.idOrder = idOrder;
        this.idBook = idBook;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        //ID_ORDER_ITEM, idOrder,idBook,quantity,price
        return String.format("%s,%s,%s,%s,%s", this.id, this.idOrder, this.idBook, this.quantity, this.price);
    }
}
