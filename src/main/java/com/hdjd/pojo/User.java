package com.hdjd.pojo;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User {
    private int id;
    private String username;
    private String password;

    public User() {

    }
    public User(String name) {
        this.username = name;
    }
    public User(int id, String name, String password) {
        this.id = id;
        this.username = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
