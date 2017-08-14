package com.buxlife.domainServiceImplementation.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class Upvote implements Serializable {
    private int counter;


    private Upvote(){}

    public Upvote(Builder builder){this.counter = builder.counter;}

    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }

    public static class Builder {
        private int counter;

        public Builder counter(int value) {
            this.counter = value;
            return this;
        }

        public Upvote build(){return new Upvote(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Upvote upVote = (Upvote) o;

        return counter == upVote.counter;
    }

    @Override
    public int hashCode() {
        return counter;
    }
}