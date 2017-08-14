package com.buxlife.domainServiceImplementation.Domain;

import java.io.Serializable;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class Downvote implements Serializable {
    private int counter;

    private Downvote(){}

    public Downvote(Builder builder){this.counter = builder.counter;}

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

        public Downvote build() {
            return new Downvote(this);
        }
    }
}