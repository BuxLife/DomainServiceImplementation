package com.buxlife.domainServiceImplementation.Services;

import com.buxlife.domainServiceImplementation.Domain.Game;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public interface GameService {
    Game create(Game game);
    Game read(String title);
    Game update(Game game);
    void delete(String title);
}
