package com.buxlife.domainServiceImplementation.Factories;

import com.buxlife.domainServiceImplementation.Domain.Downvote;
import com.buxlife.domainServiceImplementation.Domain.Game;
import com.buxlife.domainServiceImplementation.Domain.Review;
import com.buxlife.domainServiceImplementation.Domain.Upvote;

import java.util.Map;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class ReviewFactory {
    public static Review getGame(Map<String, Object> values){
        Review review = new Review.Builder()
                .game((Game) (values.get("game")))
                .review((String)values.get("review"))
                .upVotes((Upvote) values.get("upVotes"))
                .downVotes((Downvote) values.get("downVotes"))
                .build();
        return review;
    }
}
