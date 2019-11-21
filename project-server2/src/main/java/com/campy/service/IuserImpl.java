package com.campy.service;

import org.springframework.stereotype.Service;

/**
 * @author ran_ych
 * @create 2019-09-28  17:14
 * @desc
 */
@Service("users")
public class IuserImpl implements User {
    @Override
    public Integer userlogin(String mnum, String mpassword) {
        if("alex".equals(mnum)&&"ryc".equals(mpassword)){
            return 1;
        }
            return 0;

    }
    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public Integer add(Integer a, Integer b) {
        return a+b;
    }
}
