package com.happybuy.service;

import java.util.List;

import com.happybuy.dto.ResponseDTO;
import com.happybuy.model.User;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
    boolean save(User user);
}
