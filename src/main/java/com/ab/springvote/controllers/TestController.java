package com.ab.springvote.controllers;

import com.ab.springvote.pojo.Subjects;
import com.ab.springvote.pojo.Users;
import com.ab.springvote.service.SubjectsService;
import com.ab.springvote.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author young
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private SubjectsService subjectsService;

    @RequestMapping("1")
    private String test(){
        return "test";
    }

    @RequestMapping("login")
    private String test1(){
        Users u=new Users();
        u.setUsername("abthen");
        u.setUpassword("abthen@180");
        int key=usersService.login(u);
        System.out.println(key);
        return "test";
    }

    @RequestMapping("all")
    private String findAll(){

        List<Users> list=usersService.seekAll();
        System.out.println(list);
        return "test";
    }

    @RequestMapping("add")
    private String addUsers(){
        Users u=new Users();
        u.setUsername("CARROTZY");
        u.setUpassword("carrot@180");
        u.setUstatus(1);
        usersService.insertUser(u);
        System.out.println(u.getUid());
        return "test";
    }


    /**使用mybaitsplus做插入
     * @return
     */
    @RequestMapping("addbyplus")
    private String addUsersbyPlus(){
        Users u=new Users();
        u.setUsername("CARROTZY");
        u.setUpassword("carrot@180");
        u.setUstatus(1);
        usersService.save(u);
        System.out.println(u.getUid());
        return "test";
    }

    /**使用mybaitsplus根据ID做修改
     * @return
     */
    @RequestMapping("updataplus")
    private String updataUsersbyPlus(){
        Users u=new Users();
        u.setUid(1008);
        u.setUsername("CARROTZY");
        u.setUpassword("abthen@180");
        u.setUstatus(1);

        boolean key= usersService.updateById(u);
        System.out.println(key);
        return "test";
    }

    /**使用mybaitsplus根据ID做删除
     * @return
     */
    @RequestMapping("deleteplus")
    private String deleteUsersbyPlus(){
        boolean key=usersService.removeById(1004);
        System.out.println(key);
        return "test";
    }

    @RequestMapping("findplus")
    private String findALLbyPlus(){
        List<Users> list=usersService.list();
        System.out.println(list);
        return "test";
    }

    @RequestMapping("addsbyplus")
    private String addSubject(){
        Subjects s=new Subjects();
        s.setSid(1000);
        s.setTitle("新冠啥时候消失");
        s.setType(1);

        boolean key=subjectsService.save(s);
        System.out.println(s);
        List<Subjects> list=subjectsService.list();
        System.out.println(list);
        return "test";

    }
}
