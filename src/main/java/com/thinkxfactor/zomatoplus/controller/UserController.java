package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		User persistedUser=userRepository.save(user);
		return persistedUser;
	}
	@GetMapping("/getAll")
		public List<User> getAll(){
		List<User> listofusers=userRepository.findAll();
		return listofusers;
	}

	/*@GetMapping("/loginEn")
	public User userLogin(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		User user = new User();
		user.setUsername("Aritra");
		user.setPassword("123");
		return user;
	}
	
	/@GetMapping("/all")
	public List<User> userList() {
		List<User> users = new ArrayList<>();
		User user1,user2,user3;
		user1=new User("Abhishek","234");
		user2=new User("Aritra","234");
		user3=new User("Sourav","234");
		users.add(user1);
		users.add(user2);
		users.add(user3);
		return users;
	}
	
	@PostMapping("/create")
	public User usercreate(@RequestBody User us) {
		User u1=new User("A","1","abc@gmail.com","9876543201");
		System.out.println(u1.toString());
		return us;
		
	}*/
	
	
	
	
	@PostMapping("/login")
	public User userlogin(@RequestBody User usr)
	{
		User myus=new User();
		User usr1=userRepository.findByNameAndPassword(usr.getName(),usr.getPassword());
		if(usr1.equals(null))
			return null;
		else
			return usr1;
		
	}
	
}