package com.buxlife.domainServiceImplementation.Repositories.Impl;

import com.buxlife.domainServiceImplementation.Domain.User;
import com.buxlife.domainServiceImplementation.Repositories.UserRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public class UserRepositoryImpl implements UserRepository{
    private static UserRepositoryImpl repo = null;

    private Map<Object, User> userTable;

    private UserRepositoryImpl(){ userTable = new HashMap<Object, User>();}
    public static UserRepositoryImpl getInstance(){
        if(repo == null){
            repo = new UserRepositoryImpl();
        }
        return repo;
    }

    public User create(User user){
         userTable.put(user.getDateJoined().toString(), user);
         userTable.put(user.getUsername(), user);
         userTable.put(user.getPassword(), user);
         userTable.put(user.getUpVotes(), user);
         userTable.put(user.getDownVotes(), user);
         User savedUser = userTable.get(user.getUsername());
        return savedUser;
    }

    public User read(String username){
        User user = userTable.get(username);
        return user;
    }

    public User update(User user){
        userTable.put(user.getUsername(), user);
        User savedUser = userTable.get(user.getUsername());
        return savedUser;
    }

    public void delete(String username){
        userTable.remove(username);
    }


}
