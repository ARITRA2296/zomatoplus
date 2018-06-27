package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repository.UserRepository;
//import com.thinkxfactor.zomatoplus.models.AddItem;



@RestController
@RequestMapping("/restaurant")
public class Restaurantcontroller {
	@Autowired
	private RestaurantRepository restaurantRepository;
	private ItemRepository itemRepository;
	
	@PostMapping("/add")
	public Restaurant addUser(@RequestBody Restaurant rt) {
		Restaurant persistedUser=restaurantRepository.save(rt);
		return persistedUser;
	}
	@GetMapping("/getAll")
		public List<Restaurant> getAll(){
		List<Restaurant> listofusers=restaurantRepository.findAll();
		return listofusers;
	}

	
	
/*}

	@PostMapping("/create")
	public Restaurant restcreate(@RequestBody Restaurant r1) {
		Restaurant rr=new Restaurant("ABC","22 BK Street","abc@gmail.com","9876543201");
		System.out.println(rr.toString());
		return r1;
		
	}
*/
	
	@PostMapping("/AddItem")
	public Items additem(@RequestBody Items at) {
		itemRepository.saveAndFlush(at);
		return at;
		
	}

}