/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ripesh.kaampay.service.impl;

import com.ripesh.kaampay.entity.User;
import com.ripesh.kaampay.service.UserService;
import com.ripesh.kaampay.service.repositoryimpl.UserRepositoryImpl;
import java.util.List;

/**
 *
 * @author Ripesh
 */
public class UserServiceImpl implements UserService {

    private UserRepositoryImpl userRepository = new UserRepositoryImpl();

    @Override
    public void save(User user) throws Exception {
        if (user.getId() == 0) {
            userRepository.insert(user);
        } else {
            userRepository.update(user);
        }
    }

    @Override
    public List<User> findAll() throws Exception {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) throws Exception {
  return userRepository.findById(id);
    }

   

}
