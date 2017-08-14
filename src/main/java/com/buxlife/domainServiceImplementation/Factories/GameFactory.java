package com.buxlife.domainServiceImplementation.Factories;


import com.buxlife.domainServiceImplementation.Domain.Game;
import com.buxlife.domainServiceImplementation.Domain.Review;

import java.util.Map;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class GameFactory {
    public static Game getGame(Map<String, Object> values){
        Game game = new Game.Builder()
                .id((Integer) (values.get("gameID")))
                .title((String)values.get("username"))
                .discription((String) values.get("description"))
                .reviewList((Review) values.get("reviewList"))
                .build();
        return game;
    }
}
