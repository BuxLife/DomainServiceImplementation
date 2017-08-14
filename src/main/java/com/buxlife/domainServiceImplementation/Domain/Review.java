package com.buxlife.domainServiceImplementation.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class Review implements Serializable {
    private Game game;
    private String review;
    private Upvote upVotes;
    private Downvote downVotes;
    private int votes;
    private int reviewID;

    private Review(){}

    public Review(Builder build){
        this.game = build.currentGame;
        this.review = build.currentReview;
        this.upVotes = build.voteUp;
        this.downVotes = build.voteDown;
        this.votes = build.totalVotes;
        this.reviewID = build.reviewID;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public static class Builder{
        private String currentReview;
        private Game currentGame;
        private int totalVotes;
        private Upvote voteUp;
        private Downvote voteDown;
        private int reviewID;

        public Builder review(String value)
        {
            this.currentReview = value;
            return this;
        }

        public Builder game(Game value){
            this.currentGame = value;
            return this;
        }

        public Builder upVotes(Upvote value){
            this.voteUp = value;
            return this;
        }

        public Builder downVotes(Downvote value){
            this.voteDown = value;
            return this;
        }

        public Builder totalVotes(Upvote value1, Downvote value2, int value){
            value = value1.getCounter() - value2.getCounter();
            this.totalVotes = value;
            return this;
        }

        public Builder reviewID(Review value){
            this.reviewID = value.getReviewID();
            return this;
        }
        public Review build(){ return new Review(this);}

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        return reviewID == review.reviewID;
    }

    @Override
    public int hashCode() {
        return reviewID;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
