package com.example.restapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.restapi.services.ItemService;

import com.example.restapi.entities.Items;
//import com.example.restapi.services.ItemService;

@RestController
public class Controller {
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/home")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/items")
	public List<Items> getItems() {
		
		return this.itemService.getItems();
	}
	
	@GetMapping("/items/{itemId}")
	public Items getItems(@PathVariable String itemId) {
		return this.itemService.getItems(Long.parseLong(itemId));

}
	
	@GetMapping("/items/set-of-item/{ids}")
	public List<Items> getSetOfItemIds(@PathVariable List<Long> ids){
	
		return itemService.getSetOfItemIds(ids);
	}
		
	}

