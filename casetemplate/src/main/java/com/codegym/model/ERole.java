package com.codegym.model;

public enum ERole {
    ADMIN(1), USER(2), GUEST(3);

    private int id;
    private ERole(int id) {
        this.id = id;
    }

    public static ERole getERole(String name) {
        for (ERole role : values()) {
            if (role.toString().equals(name)) {
                return role;
            }
        }
        return null;
    }
}
