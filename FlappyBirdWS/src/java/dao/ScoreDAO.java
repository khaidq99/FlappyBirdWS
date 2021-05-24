/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author KHAI-PC
 */
public class ScoreDAO extends DAO {
    public ScoreDAO(){
        super();
    }
    
    public boolean saveScore(int userId, int score){
        String sql = "INSERT INTO score(user_id, score, create_at) VALUES(?, ?, now())";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setInt(2, score);
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public List<Score> getScoreHistory(String username){
        List<Score> scores = new ArrayList<>();
        
        String sql = "SELECT  score.id, score.score, score.create_at FROM `user` "
                + "INNER JOIN score  "
                + "ON user.id = score.user_id "
                + "WHERE user.username = ? "
                + "ORDER BY create_at DESC";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                int score = rs.getInt("score");
                Date date = rs.getDate("create_at");
                Score s = new Score();
                s.setId(id);
                s.setScore(score);
                s.setCreateAt(date);
                scores.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return scores;
    }
    
    public List<Score> getTopScoreUser(){
        List<Score> scores = new ArrayList<>();
        
        String sql = "SELECT user.id, username, name, score.id, score, create_at "
                + "FROM user INNER JOIN score "
                + "ON user.id = score.user_id "
                + "ORDER BY score.score DESC "
                + "LIMIT 10";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int userId = rs.getInt("user.id");
                String username = rs.getString("username");
                String name = rs.getString("name");
                User user = new User();
                user.setId(userId);
                user.setUsername(username);
                user.setName(name);
                int scoreId = rs.getInt("score.id");
                int score = rs.getInt("score");
                Date date = rs.getDate("create_at");
                Score s = new Score();
                s.setId(scoreId);
                s.setScore(score);
                s.setCreateAt(date);
                s.setUser(user);
                scores.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return scores;
    }
    
    public Score getHighestScoreAUser(String username){
        
        String sql = "SELECT user.id, username, name, score.id, score, create_at "
                + "FROM user INNER JOIN score ON user.id = score.user_id "
                + "WHERE username = ? ORDER BY score.score DESC LIMIT 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int userId = rs.getInt("user.id");
                String name = rs.getString("name");
                User user = new User();
                user.setId(userId);
                user.setUsername(username);
                user.setName(name);
                int scoreId = rs.getInt("score.id");
                int score = rs.getInt("score");
                Date date = rs.getDate("create_at");
                Score s = new Score();
                s.setId(scoreId);
                s.setScore(score);
                s.setCreateAt(date);
                s.setUser(user);
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
