package com.example.demo.domain;

import javax.persistence.*;

/**
 * Created by mgx on 17/11/24.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
