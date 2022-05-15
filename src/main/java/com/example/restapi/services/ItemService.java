package com.example.restapi.services;

//import java.util.ArrayList;
import java.util.List;

import com.example.restapi.entities.Items;

public interface ItemService {
	public List<Items> getItems();
	public Items getItems(long itemId);
	public List<Items> getSetOfItemIds(List<Long> setOfIds);
}
