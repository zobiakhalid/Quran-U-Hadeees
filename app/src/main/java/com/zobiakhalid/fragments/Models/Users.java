package com.zobiakhalid.fragments.Models;

public class Users {
    String name;

    public Users(){}

    public Users(String name, String email, String password, String phone_no) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone_no = phone_no;
    }

    String email;
    String password;
    String phone_no;
    String last_message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getLast_message() {
        return last_message;
    }

    public void setLast_message(String last_message) {
        this.last_message = last_message;
    }
}
