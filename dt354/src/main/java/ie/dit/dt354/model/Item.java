package ie.dit.dt354.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private long id;
	private String name;
	private String itemCategory, itemType, itemSubType, drinkMeasure, foodSpicy, foodVeg;
	private int quantity;
	private double price;
	
	public Item() {
		super();
	}
	

	public Item(long id, String name, String itemCategory, String itemType, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.itemCategory = itemCategory;
		this.itemType = itemType;
		this.quantity = quantity;
		this.price = price;
	}


	public Item(long id, String name, String itemCategory, String itemType, String itemSubType, String drinkMeasure,
			String foodSpicy, String foodVeg, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.itemCategory = itemCategory;
		this.itemType = itemType;
		this.itemSubType = itemSubType;
		this.drinkMeasure = drinkMeasure;
		this.foodSpicy = foodSpicy;
		this.foodVeg = foodVeg;
		this.quantity = quantity;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemSubType() {
		return itemSubType;
	}

	public void setItemSubType(String itemSubType) {
		this.itemSubType = itemSubType;
	}

	public String getDrinkMeasure() {
		return drinkMeasure;
	}

	public void setDrinkMeasure(String drinkMeasure) {
		this.drinkMeasure = drinkMeasure;
	}

	public String getFoodSpicy() {
		return foodSpicy;
	}

	public void setFoodSpicy(String foodSpicy) {
		this.foodSpicy = foodSpicy;
	}

	public String getFoodVeg() {
		return foodVeg;
	}

	public void setFoodVeg(String foodVeg) {
		this.foodVeg = foodVeg;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
