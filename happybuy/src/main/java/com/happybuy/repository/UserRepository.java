package com.happybuy.repository;

import com.happybuy.model.User;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserRepository{
    User findByUsername (String username );
    User findOne(Long id);
    boolean save(User user);
}

