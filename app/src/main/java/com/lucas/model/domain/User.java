package com.lucas.model.domain;

public class User {

    public User() {}

    public User(Integer id, String username, String email, String password, Integer type_user) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.type_user = type_user;
    }

    private Integer id;
    private String username;
    private String email;
    private String password;
    private Integer type_user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getType_user() {
        return type_user;
    }

    public void setType_user(Integer type_user) {
        this.type_user = type_user;
    }
}
