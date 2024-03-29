package com.codegym.model;

public class User {
    private long id;
    private String username;
    private String password;

    private long idCustomer;
    private ERole role;

    public User(long id, String username, String password, long idCustomer, ERole role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.idCustomer = idCustomer;
        this.role = role;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public ERole getRole() {
        return role;
    }

    public void setRole(ERole role) {
        this.role = role;
    }
}
