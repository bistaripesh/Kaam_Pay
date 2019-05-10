/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ripesh.kaampay.entity;

import java.util.Date;

/**
 *
 * @author Ripesh
 */
public class User extends MasterEntity {

   // public int id;
    public String email, password;
    public Date createdDate, modifiedDate;

    public User() {
    }

    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
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
    public void setDate(Date modifiedDate){
        this.modifiedDate=modifiedDate;
    }
    public Date getDate(Date modifiedDate){
        return modifiedDate;
    }

}
