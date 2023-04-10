package com.codegym.service;

import com.codegym.model.Book;
import com.codegym.utils.DateUtils;
import com.codegym.utils.FileUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookServiceInFile implements IBookService{
    public final String pathBook = "./data/book.csv";
    @Override
    public List<Book> getAll(){
        List<Book> books = FileUtils.readDataFromFile(pathBook, FileUtils.CLASS_BOOK);
        return books;

    }
    @Override
    public void updateBookById(long id, Book book){
        List<Book> books = getAll();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.get(i).setName(book.getName());
                books.get(i).setPrice(book.getPrice());
                books.get(i).setDescription(book.getDescription());
                books.get(i).setEntryDate(book.getEntryDate());
            }
        }

        FileUtils.writeDateToFile(pathBook,books);

    }
    @Override
    public void deleteBookById(long id){
        List<Book> books = getAll();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                break;
            }
        }
        FileUtils.writeDateToFile(pathBook,books);

    }
}
