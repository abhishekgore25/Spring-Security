package com.example.springsecuritypractice.entity;


import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;


@Entity
public class User {

    private int id;
    private String name;
    private String role;
    private String password;

    public User(int id, String name, String role, String password) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id) {
        this.id = id;
    }

    public User() {
    }
}
