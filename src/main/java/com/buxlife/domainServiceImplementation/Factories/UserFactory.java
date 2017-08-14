package com.buxlife.domainServiceImplementation.Factories;

import com.buxlife.domainServiceImplementation.Domain.User;

import java.util.Date;
import java.util.Map;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class UserFactory {
    public static User getUser(Map<String, Object>values){
        User user = new User.Builder()
                .dateJoined((Date) (values.get("dateJoined")))
                .username((String)values.get("username"))
                .password((String) values.get("password"))
                .upvotes((Integer) values.get("upVotes"))
                .downvotes((Integer)values.get("downVotes"))
                .build();
        return user;
    }
}
