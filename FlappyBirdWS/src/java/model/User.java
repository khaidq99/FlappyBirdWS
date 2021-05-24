/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author KHAI-PC
 */
public class User implements Serializable {
    private int id;
    private String username, password, name;
    private List<Score> scores;

    public User() {
    }

    public User(int id, String username, String password, String name, List<Score> scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.scores = scores;
    }

    public User(String username, String password, String name, List<Score> scores) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
    
    
    
}
