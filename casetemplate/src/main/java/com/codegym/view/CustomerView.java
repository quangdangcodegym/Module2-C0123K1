package com.codegym.view;

import com.codegym.service.CustomerServiceInmemory;

public class CustomerView {
    private CustomerServiceInmemory customerService;

    public CustomerView() {
        customerService = new CustomerServiceInmemory();
    }
    public void launcher() {

    }
}
