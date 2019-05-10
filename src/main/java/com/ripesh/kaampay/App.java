/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ripesh.kaampay;

import com.ripesh.kaampay.entity.User;
import com.ripesh.kaampay.service.UserService;
import com.ripesh.kaampay.service.impl.UserServiceImpl;

/**
 *
 * @author Ripesh
 */
public class App {
    public static void main (String [] args ) throws Exception{
        UserService userService = new UserServiceImpl();
//          User user = new User(0,"bistaripesh@icloud.com", "bista123");
//         userService.save(user);
        System.out.println(userService.findById(1).getEmail()); 
}
}