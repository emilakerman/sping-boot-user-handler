package com.emilakerman.demo;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class User {
    private int id;
    private String name;
    private String email;
    private Date createdDate;

    protected User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.createdDate = new Date();
        this.email = email;
    }

    // TODO: Write function to create a user in the DB.
    public static void createUser(int id, String name, String email) {
        User user = new User(id, name, email);
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getId() {
        return id;
    }
    public Date getCreatedDate() {
        return createdDate;
    }

}
