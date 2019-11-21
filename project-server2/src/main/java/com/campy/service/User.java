package com.campy.service;

/**
 * @author ran_ych
 * @create 2019-09-28  17:06
 * @desc
 */
public interface User {
    public Integer userlogin(String mnum,String mpassword);
    public String hello();
    public Integer add(Integer a,  Integer b);
}
