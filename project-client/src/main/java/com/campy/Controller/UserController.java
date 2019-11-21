package com.campy.Controller;

import com.campy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ran_ych
 * @create 2019-09-28  17:28
 * @desc
 */
@RestController
public class UserController {

    @Autowired
    private UserService service;//远程服务




    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a,@RequestParam Integer b) {
        return service.add(a,b);
    }

    /*
     * 通过Feign远程服务
     *
     */
    @PostMapping("/login/{uid}/{pwd}")
    public String login(String uid, String pwd) {
        System.out.println("绘制："+service.login(uid, pwd));
        if(service.login(uid, pwd).equals("fail")) {
            return  "fail";
        }else {
            return service.login(uid, pwd);
        }
    }
    
    @GetMapping("/hello")
    public String Hello(){
        return "hello-1";
    }
}
