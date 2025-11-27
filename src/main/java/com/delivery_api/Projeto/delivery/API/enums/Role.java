package com.delivery_api.Projeto.delivery.API.enums;

public enum Role {
    ADMIN("ADMIN"),
    RESTAURANTE("RESTAURANTE"),
    CLIENTE("CLIENTE");

    private final String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}