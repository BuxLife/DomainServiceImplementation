package com.buxlife.domainServiceImplementation.Domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class Game implements Serializable {
    private int gameID;
    private String title;
    private String description;
    private List<Review> reviewsList;

    private Game(){}

    public Game(Builder build){
        this.gameID = build.id;
        this.title = build.gameTitle;
        this.description = build.discript;
        this.reviewsList = build.reviewList;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        return gameID == game.gameID;
    }
    public static class Builder{
        private int id;
        private String gameTitle;
        private String discript;
        private List<Review> reviewList;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder title(String value){
            this.gameTitle = value;
            return this;
        }
        public Builder discription(String value){
            this.discript = value;
            return this;
        }
        public Builder reviewList(Review value){
            this.reviewList.add(value);
            return this;
        }

    }

    @Override
    public int hashCode() {
        return gameID;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
