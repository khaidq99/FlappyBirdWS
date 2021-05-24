/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author KHAI-PC
 */
public class Score implements Serializable {
    private int id;
    private int score;
    private Date createAt;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Score() {
    }

    public Score(int id, int score, Date createAt, User user) {
        this.id = id;
        this.score = score;
        this.createAt = createAt;
        this.user = user;
    }

    public Score(int score, Date createAt, User user) {
        this.score = score;
        this.createAt = createAt;
        this.user = user;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    
    
}
