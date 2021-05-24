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
     
    public boolean checkLogin(User user) {
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                user.setName(rs.getString("name"));
                return true;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean saveRegister(User user){
        String sql = "INSERT INTO user(username, password, name) VALUES(?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getName());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    
}
