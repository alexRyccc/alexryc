package com.campy.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * 客户端调用服务器的方法，Feign是一个声明式的Web Service客户端，
 * 它使得编写Web Serivce客户端变得更加简单。
 * 我们只需要使用Feign来创建一个接口并用注解来配置它既可完成。
 * @author
 *
 */
@FeignClient(value ="PROJECT-SERVICE",fallback = UserServiceFallBack.class)
public interface UserService {
	
	 
	 @PostMapping(value = "/login/{uid}/{pwd}")
	public String login(@PathVariable("uid") String uid, @PathVariable("pwd") String pwd);

	@RequestMapping(method = RequestMethod.GET, value = "/add")
	public Integer add(@RequestParam ("a")Integer a, @RequestParam("b") Integer b);

	@GetMapping(value = "/hello")
	public String Hello();

	
}
