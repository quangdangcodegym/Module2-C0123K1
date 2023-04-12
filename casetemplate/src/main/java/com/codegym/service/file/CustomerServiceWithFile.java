package com.codegym.service.file;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import com.codegym.utils.FileUtils;

import java.util.List;

public class CustomerServiceWithFile implements ICustomerService {
    public List<Customer> getAll(){

        List<Customer> customers = FileUtils.readDataFromFile("./data/customer.csv", FileUtils.CLASS_CUSTOMER);

        return customers;
    }

    public void updateCustomerById(long id, Customer customer) {


    }
    public void deleteCustomerById(long id) {

    }
}
