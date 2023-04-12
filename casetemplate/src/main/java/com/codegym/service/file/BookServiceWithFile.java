package com.codegym.service.file;

import com.codegym.model.Book;
import com.codegym.service.IBookService;
import com.codegym.utils.FileUtils;

import java.util.List;

public class BookServiceWithFile implements IBookService {
    public final String pathBook = "./data/book.csv";
    @Override
    public List<Book> getAll(){
        List<Book> books = FileUtils.readDataFromFile(pathBook, FileUtils.CLASS_BOOK);
        return books;

    }

    @Override
    public Book findBookById(long idBook) {
        List<Book> books = getAll();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == idBook) {
                return books.get(i);
            }
        }
        return null;
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
