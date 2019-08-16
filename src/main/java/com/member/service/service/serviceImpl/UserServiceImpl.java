package com.member.service.service.serviceImpl;

import com.member.service.dao.UserDao;
import com.member.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Classname: userServiceImpl
 * @Description: TODO
 * @Date: 2019-07-29 11:06
 * @Author: Yu.Liu
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public void insert1(String id) {
        userDao.insert1(id);
    }

    @Override
    public void insert2(String id) {
        userDao.insert2(id);
    }
}
