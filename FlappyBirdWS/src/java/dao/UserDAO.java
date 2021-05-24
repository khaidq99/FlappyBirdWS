/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import model.User;

/**
 *
 * @author KHAI-PC
 */
public class UserDAO extends DAO {
    public UserDAO() {
        super();
    }
     
    public User checkLogin(String username, String password) {
        User user = null;
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                user = new User();
                user.setUsername(username);
                user.setPassword(password);
                user.setName(rs.getString("name"));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public boolean saveRegister(String username, String password, String name){
        String sql = "INSERT INTO user(username, password, name) VALUES(?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, name);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    
}
