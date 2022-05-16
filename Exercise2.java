package ak;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {

	public static void main(String[] args) {
		
		List<Item> items =new ArrayList<>();
		List<Item> filteredItems =new ArrayList<>();
		
		
		items.add(new Item(145,399,"Double Size Bedsheet","Kitex"));
		items.add(new Item(145,399,"Double Size Bedsheet","lal"));
		items.add(new Item(145,399,"Double Size Bedsheet","kakl"));
		items.add(new Item(145,399,"Double Size Bedsheet","Tail"));
		items.add(new Item(145,250,"Double Size Bedsheet","Tata"));
		items.add(new Item(145,800,"Double Size Bedsheet","Tata"));
		
		filteredItems=items.stream()
				.filter(item -> item.getBrand().startsWith("T"))
				.sorted(Comparator.comparing(Item::getPrice).reversed()).collect(Collectors.toList());
		
		for(Item item :filteredItems) {
			System.out.println(item.toString());
			
		}
		
		
		
		
	}

}
