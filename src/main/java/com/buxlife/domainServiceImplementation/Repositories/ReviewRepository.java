package com.buxlife.domainServiceImplementation.Repositories;

import com.buxlife.domainServiceImplementation.Domain.Review;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public interface ReviewRepository {
    Review create(Review review);
    Review read(int id);
    Review update(Review review);
    void delete(int id);
}
