package com.codegym.service;

import com.codegym.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAll();
    void updateBookById(long id, Book book);
    void deleteBookById(long id);
}
