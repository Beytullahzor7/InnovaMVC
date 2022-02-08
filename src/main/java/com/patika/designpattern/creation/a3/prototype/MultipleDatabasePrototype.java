package com.patika.designpattern.creation.a3.prototype;

public abstract class MultipleDatabasePrototype implements Cloneable {

    private String userName = "root";
    private String userPassword = "root";

    //Clone Object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //GETTER AND SETTER
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
