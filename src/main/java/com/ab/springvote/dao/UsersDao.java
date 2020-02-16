package com.ab.springvote.dao;

import com.ab.springvote.pojo.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author young
 */
@Repository
@Mapper
public interface UsersDao extends BaseMapper<Users> {
    /**
     * 查找用户
     * @param user 用户
     * @return 查找信息，为1则为存在
     */
    public int findUser(Users user);

    /**
     * 查找所有用户
     * @return
     */
    public List<Users> findAll();


    /**
     * 添加用户
     * @param user
     */
    /* useGeneratedKeys="true" keyProperty="id"*/
    public void insertUser(Users user);

    /**
     * 删除用户表里该用户
     * @param user 一个用户
     */
    public void deleteUser(Users user);

    /**
     * 修改用户信息
     * @param user
     */
    public void update(Users user);
}
