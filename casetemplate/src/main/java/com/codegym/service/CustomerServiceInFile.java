package com.codegym.service;

import com.codegym.model.Book;
import com.codegym.model.Customer;
import com.codegym.utils.DateUtils;
import com.codegym.utils.FileUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerServiceInFile {
    public List<Customer> getAll(){

        List<Customer> customers = FileUtils.readDataFromFile("./data/customer.csv", FileUtils.CLASS_CUSTOMER);

        return customers;
    }

    public void updateCustomerById(long id, Customer customer) {
    }
    public void deleteCustomerById(long id) {

    }
}
