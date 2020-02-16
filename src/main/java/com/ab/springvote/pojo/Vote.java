package com.ab.springvote.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.List;

/**
 * @author young
 */
@TableName("vote")
public class Vote  implements Serializable {

    /**
     * vid 投票id
     * user 一个投票对应一个用户
     * v_sid 一个投票对应一个主题id
     * listOptions 一个投票对应一个或多个选项
     */
    @TableId("vid")
    private int vid;
    private Users user;
    private int v_sid;
    private List<Voptions> listOptions;

    public Vote() {
    }

    public Vote(int vid, Users user, int v_sid, List<Voptions> listOptions) {
        this.vid = vid;
        this.user = user;
        this.v_sid = v_sid;
        this.listOptions = listOptions;
    }

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getV_sid() {
        return v_sid;
    }

    public void setV_sid(int v_sid) {
        this.v_sid = v_sid;
    }

    public List<Voptions> getListOptions() {
        return listOptions;
    }

    public void setListOptions(List<Voptions> listOptions) {
        this.listOptions = listOptions;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "vid=" + vid +
                ", user=" + user +
                ", v_sid=" + v_sid +
                ", listOptions=" + listOptions +
                '}';
    }
}
