package com.codegym.service;

import com.codegym.model.Book;
import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> getAll();
    void updateCustomerById(long id, Customer customer);
    void deleteCustomerById(long id);
}
