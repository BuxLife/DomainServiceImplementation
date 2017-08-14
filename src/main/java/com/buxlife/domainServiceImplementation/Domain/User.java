package com.buxlife.domainServiceImplementation.Domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class User implements Serializable {
    private Date dateJoined;
    private String username;
    private String password;
    private int upVotes;
    private int downVotes;

    private User(){}

    public User(Builder builder){
        this.dateJoined = builder.dateJoined;
        this.username = builder.username;
        this.password = builder.password;
        this.upVotes = builder.upVotes;
        this.downVotes = builder.downVotes;
    }

    public Date getDateJoined() {
        return dateJoined;
    }
    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
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
    public int getUpVotes() {
        return upVotes;
    }
    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }
    public int getDownVotes() {
        return downVotes;
    }
    public void setDownVotes(int dVotes) {
        downVotes = dVotes;
    }

    public static class Builder{
        private Date dateJoined;
        private String username;
        private String password;
        private int upVotes;
        private int downVotes;

        public Builder dateJoined(Date value){
            this.dateJoined = value;
            return this;
        }

        public Builder username(String value){
            this.username = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Builder upvotes(int value){
            this.upVotes = value;
            return this;
        }
        public Builder downvotes(int value){
            this.downVotes = value;
            return this;
        }
        public User build(){ return new User(this);}
    }

}