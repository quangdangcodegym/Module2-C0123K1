package com.codegym.service;

import com.codegym.model.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookServiceInmemory implements IBookService{
    List<Book> books;

    public BookServiceInmemory() {
        books = new ArrayList<>();

//        long id, String name, String description, Date entryDate, double price)
        Book book = new Book(1L, "fChị Dậu", "chị dậu....", new Date(), 10000.0d);
        books.add(book);
        books.add(new Book(2L, "dChí Phèo", "chí phèo....", new Date(), 20000.0d));
        books.add(new Book(3L, "aChí Phèo3", "chí phèo3....", new Date(), 30000.0d));
        books.add(new Book(19L, "cChí Phèo4", "chí phèo4....", new Date(), 40000.0d));
        books.add(new Book(5L, "aaChí Phèo5", "chí phèo5....", new Date(), 50000.0d));
        books.add(new Book(6L, "Chí Phèo6", "chí phèo6....", new Date(), 60000.0d));
    }

    @Override
    public List<Book> getAll() {
        return this.books;
    }

    @Override
    public void updateBookById(long id, Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                books.get(i).setName(book.getName());
                books.get(i).setDescription(book.getDescription());
                books.get(i).setPrice(book.getPrice());
            }
        }
    }

    @Override
    public void deleteBookById(long id) {
        for (int i = 0; i < books.size(); i++) {
            if (id == books.get(i).getId()) {
                books.remove(i);
            }
        }
    }
}
