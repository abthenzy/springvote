package com.ab.springvote.service;

import com.ab.springvote.pojo.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author young
 */
@Transactional(rollbackFor = Exception.class)
public interface UsersService extends IService<Users> {

    /**
     * 登录
     * @param user
     * @return
     */
    public int login(Users user);

    public List<Users> seekAll();

    public void insertUser(Users user);

    public void deleteUser(Users user);

    public void updataUsers(Users user);
}
