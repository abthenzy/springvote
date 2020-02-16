package com.ab.springvote.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.List;

/**
 * 用户表
 * @author young
 */
@TableName("users")
public class Users implements Serializable {
    /**
     * uid 用户id
     * username 用户姓名
     * upassword 用户密码
     * ustatus 用户身份
     *
     */
    @TableId("uid")
    private int uid;
    private String username;
    private String upassword;
    private int ustatus;



    public Users() {
    }

    public Users(int uid, String username, String upassword) {
        this.uid = uid;
        this.username = username;
        this.upassword = upassword;
        this.ustatus = ustatus;

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public int getUstatus() {
        return ustatus;
    }

    public void setUstatus(int ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", upassword='" + upassword + '\'' +
                ", ustatus=" + ustatus +
                '}';
    }
}
