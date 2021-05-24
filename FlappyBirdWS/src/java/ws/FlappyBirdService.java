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
    public boolean checkLogin(User user){
        UserDAO ud = new UserDAO();
        return ud.checkLogin(user);
    }
    
    @WebMethod
    public boolean saveRegister(User user){
        UserDAO ud = new UserDAO();
        return ud.saveRegister(user);
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
    
    @WebMethod
    public Score getHighestScoreAUser(String username){
        ScoreDAO sd = new ScoreDAO();
        return sd.getHighestScoreAUser(username);
    }
    
}
