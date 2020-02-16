package com.ab.springvote.service.impl;

import com.ab.springvote.dao.UsersDao;
import com.ab.springvote.pojo.Users;
import com.ab.springvote.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author young
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersDao,Users> implements UsersService {

    @Autowired
    private UsersDao usersDao;
    @Override
    public int login(Users user) {
        return usersDao.findUser(user);
    }

    @Override
    public List<Users> seekAll() {
        return usersDao.findAll();
    }

    @Override
    public void insertUser(Users user) {
        usersDao.insertUser(user);
    }

    @Override
    public void deleteUser(Users user) {
        usersDao.deleteUser(user);
    }

    @Override
    public void updataUsers(Users user) {
        usersDao.update(user);
    }


}
