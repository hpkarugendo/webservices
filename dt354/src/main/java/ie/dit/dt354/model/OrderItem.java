package ie.dit.dt354.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderItem {
	@Id
	private long id;
	private long itemId, orderId;

	public OrderItem() {
		super();
	}

	public OrderItem(long id, long itemId, long orderId) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.orderId = orderId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	

}
