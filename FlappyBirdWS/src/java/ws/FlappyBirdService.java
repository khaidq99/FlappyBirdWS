/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.*;
import dao.*;
import java.util.List;
import java.util.Map;

/**
 *
 * @author KHAI-PC
 */
@WebService(serviceName = "FlappyBirdService")
public class FlappyBirdService {

    @WebMethod
    public User checkLogin(String username, String password){
        UserDAO ud = new UserDAO();
        return ud.checkLogin(username, password);
    }
    
    @WebMethod
    public boolean saveRegister(String username, String password, String name){
        UserDAO ud = new UserDAO();
        return ud.saveRegister(username, password, name);
    }
    
    @WebMethod
    public boolean saveScore(int userId, int score){
        ScoreDAO sd = new ScoreDAO();
        return sd.saveScore(userId, score);
    }
    
    @WebMethod
    public List<Score> getScoreHistory(String username){
        ScoreDAO sd = new ScoreDAO();
        return sd.getScoreHistory(username);
    }
    
    @WebMethod
    public List<Score> getTopScoreUser(){
        ScoreDAO sd = new ScoreDAO();
        return sd.getTopScoreUser();
    }
    
}
