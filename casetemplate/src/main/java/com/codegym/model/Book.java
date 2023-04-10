package com.codegym.model;

import com.codegym.utils.DateUtils;

import java.util.Date;

public class Book {
    //biến toàn cục - biến instance - biến của đối tượng
    // các biến này có đặc điểm gì
    private long id;
    private String name;
    private String description;
    private Date entryDate;
    private double price;
    // overloading???
    public Book() {

    }
    // hàm khởi tạo - contructor để làm gì, đặc điểm ntn:           ???
    public Book(long id, String name, String description, Date entryDate, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.entryDate = entryDate;
        this.price = price;
    }

    //getter/setter để làm gì: ???
    public long getId() {
        return id;
    }

    public void setId(long id) {
        // từ khóa this:        ???
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        //1,Chí Phèo,Ghi lại quá trình Chí Phèo tán thị Nở,10-04-2023 14:16:30,10000
        return String.format("%s,%s,%s,%s,%s", this.id, this.name, this.description,
                DateUtils.formatDate(this.entryDate), this.price);
    }
}
