package com.example.restapi.services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

//import com.example.restapi.entities.Course;
//import com.example.restapi.entities.Course;
import com.example.restapi.entities.Items;

@Service
public class ItemServiceImpl implements ItemService {
	List<Items> list;

	
	

	public ItemServiceImpl() {
		list = new ArrayList<>();
		list.add(new Items(145,399,"Double Size Bedsheet","Kitex"));
		list.add(new Items(129,50,"Ink Pen","Cello"));
		list.add(new Items(202,10,"Chocolate","Dairy Milk"));
		
		
	}



	@Override
	public List<Items> getItems() {

		 Collections.sort(list,Comparator.comparing(Items::getPrice));
		 return list;
	}
	
	@Override
	public Items getItems(long itemId) {
		// TODO Auto-generated method stub
		Items i=null;
		for(Items item:list) {
			if(item.getItemId()==itemId) {
				i=item;
				break;
			}
		}
		
		return i;
	}



	@Override
	public List<Items> getSetOfItemIds(List<Long> setOfIds) {
	
		List<Items> list1= new ArrayList<>(); 
		for(Long item:setOfIds) {
			
			list1.add(getItems(item));
			
		
			
		}
		
		return list1;
		
		
	}
	

}


