package com.buxlife.domainServiceImplementation.Services;
import com.buxlife.domainServiceImplementation.Domain.User;

/**
 * Created by Bux_Life on 2017/08/14.
 */
public interface UserService {
    User create(User user);
    User read(String username);
    User update(User user);
    void delete(String username);
}
