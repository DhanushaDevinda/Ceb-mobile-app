package com.example.ceb;

import com.google.gson.annotations.SerializedName;

public class LoginResults {


    @SerializedName("userName")
    private String userName;

    @SerializedName("password")
    private  String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
