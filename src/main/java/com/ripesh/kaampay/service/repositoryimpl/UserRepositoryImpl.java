/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ripesh.kaampay.service.repositoryimpl;

import com.ripesh.kaampay.entity.User;
import com.ripesh.kaampay.service.repository.UserRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ripesh
 */
public class UserRepositoryImpl implements UserRepository {

    @Override
    public void insert(User user) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/kaam_pay";
        String userName = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url, userName, password);
        String sql = "insert into tbl_user(email,password) values(?,?);";
        PreparedStatement stmt = conn.prepareCall(sql);

        stmt.setString(1, user.getEmail());
        stmt.setString(2, user.getPassword());
        int result = stmt.executeUpdate();
        System.out.println("Result: " + result);

    }

    @Override
    public void update(User user) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/kaam_pay";
        String userName = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url, userName, password);
        String sql = "update tbl_user email=? password=? status=? modified_date=TIME_STAMP where id=?";
        PreparedStatement stmt = conn.prepareCall(sql);

        stmt.setString(1, user.getEmail());
        stmt.setString(2, user.getPassword());
        stmt.setInt(3, user.getId());
        int result = stmt.executeUpdate();
        System.out.println("Result: " + result);

    }

    @Override
    public List<User> findAll() throws Exception {
        List<User> users = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/kaam_pay";
        String userName = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url, userName, password);
        String sql = "select * from tbl_user;";
        PreparedStatement stmt = conn.prepareCall(sql);
        ResultSet result = stmt.executeQuery();
        while (result.next()) {
            User user = new User();

            user.setEmail(result.getString("email"));
            user.setDate(new Date(result.getDate("created_date").getTime()));
            user.setPassword(result.getString("password"));
            user.setId(result.getInt("id"));
            users.add(user);
        }

        return users;
    }

    @Override
    public User findById(int id) throws Exception {
       User user= null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/kaam_pay";
        String userName = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url, userName, password);
        String sql = "select * from tbl_user where id=?;";
        PreparedStatement stmt = conn.prepareCall(sql);
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
        while (result.next()) {
            user = new User();
            user.setId(result.getInt("id"));
            user.setEmail(result.getString("email"));
            user.setPassword(result.getString("password"));
        }
        return user;




    

    }
}

