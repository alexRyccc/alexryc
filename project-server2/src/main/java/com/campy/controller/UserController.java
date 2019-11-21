package com.campy.controller;

import com.campy.service.IuserImpl;
import com.campy.service.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ran_ych
 * @create 2019-09-28  17:20
 * @desc
 */
@RestController
public class UserController {
    @Resource(name ="users")
    private User iu ;

    @PostMapping("/login/{uid}/{pwd}")
    public String login(@PathVariable("uid")String uid, @PathVariable("pwd")String pwd) {
        System.out.println("uid:"+uid+"---"+"pwd"+pwd);
        System.out.println("登录情况"+iu.userlogin(uid, pwd));
        if(iu.userlogin(uid, pwd)>0) {

            System.out.println("登录成功Service2");
        return "登录成功Service1";
        }
        System.out.println("登录失败service2");

        return  "登录失败service1";

    }

    @GetMapping("/hello")
    public String Hello(){
        return "hello-1";
    }

    @GetMapping("/add")
    public Integer add(@RequestParam Integer a,@RequestParam Integer b) {
        return iu.add(a,b);
    }
}
