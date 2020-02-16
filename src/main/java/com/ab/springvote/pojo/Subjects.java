package com.ab.springvote.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 主题表
 * @author young
 */
@TableName("subject")
public class Subjects implements Serializable {
    /**
     *sid 主题ID
     * title 主题标题
     * type  主题选择类型1为单选，2为多选
     */
    @TableId("sid")
    private int sid;
    private String title;
    private int type;

    public Subjects() {
    }

    public Subjects(int sid, String title, int type) {
        this.sid = sid;
        this.title = title;
        this.type = type;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "sid=" + sid +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}
