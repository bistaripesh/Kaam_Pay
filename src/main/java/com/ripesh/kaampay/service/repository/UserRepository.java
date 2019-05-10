/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ripesh.kaampay.service.repository;

import com.ripesh.kaampay.entity.User;
import java.util.List;

/**
 *
 * @author Ripesh
 */
public interface UserRepository {

    void insert(User user) throws Exception;

    void update(User user) throws Exception;

    List<User> findAll() throws Exception;

    User findById(int id) throws Exception;
}
