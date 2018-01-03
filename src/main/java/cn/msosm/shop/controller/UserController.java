package cn.msosm.shop.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.msosm.shop.pojo.MisiUsers;
import cn.msosm.shop.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/addUser")
	@ResponseBody
	public Object addUser() { 
		MisiUsers user = new MisiUsers();
		user.setUsername("张三");
		user.setUserId(UUID.randomUUID().toString());
		MisiUsers resultUser = userService.addUser(user);
		return resultUser;
		
	}
	
	
	@RequestMapping("/getUser")
	@ResponseBody
	public Object getUser(String userId) {
		MisiUsers user = userService.getUserByUserId(userId);
		return user;
		
	}
	@RequestMapping("/updateUser")
	@ResponseBody
	public void updateUser() { 
		MisiUsers users = new MisiUsers();
		users.setUserId("80ff9123-a4a1-4cc9-9f88-cf8053ce0b51");
		users.setUsername("王五测试数据");
		userService.updateUserByUser(users );
		 
	}
	
	
	
	
}
