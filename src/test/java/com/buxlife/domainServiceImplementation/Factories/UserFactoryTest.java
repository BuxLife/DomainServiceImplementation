package com.buxlife.domainServiceImplementation.Factories;

import com.buxlife.domainServiceImplementation.Domain.User;
import org.junit.Assert;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class UserFactoryTest {
    Map<String, Object> values;

    @org.junit.Test
    public void getUser() throws Exception {
        Date today = new Date();
        values = new HashMap<String, Object>();
        values.put("dateJoined", today);
        values.put("username", "Dude");
        values.put("password", "Guy");
        values.put("upVotes", 12);
        values.put("downVotes", 5);
        User user = UserFactory.getUser(values);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getDateJoined());
        System.out.println(user.getUpVotes());
        System.out.println(user.getDownVotes());
        Assert.assertEquals(user.getUsername(), "Dude");

    }

}