package com.campy.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author ran_ych
 * @create 2019-09-29  10:57
 * @desc
 */
@Component

public class UserServiceFallBack implements UserService{
    @Override
    public String login(String uid, String pwd) {
        return "断路了亲";
    }

    @Override
    public Integer add(Integer a, Integer b) {
        return 000;
    }

    @HystrixCommand(fallbackMethod = "erro")
     @Override
    public String Hello() {
        return "Sorry~~";
    }
}
