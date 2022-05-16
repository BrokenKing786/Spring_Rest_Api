package ak;

public class Item {

	private long itemId;
	private long price;
	private String description;
	private String brand;
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public Item(long itemId, long price, String description, String brand) {
//		super();
		this.itemId = itemId;
		this.price = price;
		this.description = description;
		this.brand = brand;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", price=" + price + ", description=" + description + ", brand=" + brand
				+ "]";
	}
	
	
}
