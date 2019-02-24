package com.demo.deploy.service.impl;

import com.demo.deploy.model.User;
import com.demo.deploy.rep.MyUserRep;
import com.demo.deploy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 *
 * @author 10905 2019/2/24
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private MyUserRep myUserRep;
    @Override
    public List<User> findAll() {

        return myUserRep.findAll();
    }
}
