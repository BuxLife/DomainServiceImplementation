package com.buxlife.domainServiceImplementation.Services;

import com.buxlife.domainServiceImplementation.Domain.Review;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public interface ReviewService {
    Review create(Review review);
    Review read(int id);
    Review update(Review review);
    void delete(int id);
}
