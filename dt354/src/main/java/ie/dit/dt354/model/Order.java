package ie.dit.dt354.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	private long id;
	private long employeeId;
	private int tableNo, roomNo, covers;
	private double orderPrice;
	private String orderDate, orderStatus;
	
	public Order() {
		super();
	}

	public Order(long id, long employeeId, int tableNo, int roomNo, int covers, double orderPrice, String orderDate,
			String orderStatus) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.tableNo = tableNo;
		this.roomNo = roomNo;
		this.covers = covers;
		this.orderPrice = orderPrice;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getCovers() {
		return covers;
	}
	public void setCovers(int covers) {
		this.covers = covers;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
