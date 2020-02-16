package com.ab.springvote.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * 帖子选项表
 * @author young
 */
@TableName("Voptions")
public class Voptions implements Serializable {

    /**
     * oid选项ID
     * content 选项内容
     * subjects 主题标题
     *
     */
    @TableId("oid")
    private int oid;
    private String content;
    private Subjects subjects;

    public Voptions() {
    }

    public Voptions(int oid, String content, Subjects subjects) {
        this.oid = oid;
        this.content = content;
        this.subjects = subjects;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Voptions{" +
                "oid=" + oid +
                ", content='" + content + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
