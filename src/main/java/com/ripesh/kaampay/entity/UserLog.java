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
public class UserLog extends MasterEntity {
  //  private int id;
    private User user; 
    private Date loginDate;

    public UserLog(int id, User user, Date loginDate) {
        this.id = id;
        this.user = user;
        this.loginDate = loginDate;
    }

    public UserLog() {
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }
    
    
}
