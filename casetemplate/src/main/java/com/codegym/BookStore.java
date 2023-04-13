package com.codegym;

import com.codegym.model.User;
import com.codegym.view.*;

public class BookStore {

    private User user;
    private BookView bookView;
    private CustomerView customerView;
    private LoginView loginView;
    private OrderView orderView;
    private MenuView menuView;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MenuView getMenuView() {
        return menuView;
    }

    public void setMenuView(MenuView menuView) {
        this.menuView = menuView;
    }

    public BookStore() {
        bookView = new BookView(this);
        customerView = new CustomerView(this);
        loginView = new LoginView(this);
        orderView = new OrderView(this);

        menuView = new MenuView(this);
    }

    public BookView getBookView() {
        return bookView;
    }

    public void setBookView(BookView bookView) {
        this.bookView = bookView;
    }

    public CustomerView getCustomerView() {
        return customerView;
    }

    public void setCustomerView(CustomerView customerView) {
        this.customerView = customerView;
    }

    public LoginView getLoginView() {
        return loginView;
    }

    public void setLoginView(LoginView loginView) {
        this.loginView = loginView;
    }

    public OrderView getOrderView() {
        return orderView;
    }

    public void setOrderView(OrderView orderView) {
        this.orderView = orderView;
    }

    public static void main(String[] args) throws InterruptedException {


        BookStore bookStore = new BookStore();
        bookStore.loginView.launcher();


//        BookView bookView = new BookView();
//        bookView.launcher();

//        CustomerView customerView = new CustomerView();
//        customerView.launcher();


    }
}
