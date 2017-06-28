package lesson10.Homework;

import java.util.Date;

public abstract class Order {

	String itemName;
	Date dateCreated;
	Date dateConfirmed;
	Date dateShipped;
	String shipToCity;
	int basePrice;
	double totalPrice;
	Customer customerOwned;

	// Order.<init>(Order this, String itemName, Date dateCreated, String
	// shipToCity, int basePrice, Customer customerOwned)
	public Order(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned) {
		this.itemName = itemName;
		this.dateCreated = dateCreated;
		this.shipToCity = shipToCity;
		this.basePrice = basePrice;
		this.customerOwned = customerOwned;
	}

	abstract void validateOrder();

	abstract void calculatePrice();

	void confirmShipping() {

		if (dateShipped == null) {

			dateShipped = new Date();
		}

	}

	public Date getDateConfirmed() {
		return dateConfirmed;
	}

	public void setDateConfirmed(Date dateConfirmed) {
		this.dateConfirmed = dateConfirmed;
	}

	public Date getDateShipped() {
		return dateShipped;
	}

	public void setDateShipped(Date dateShipped) {
		this.dateShipped = dateShipped;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public String getShipToCity() {
		return shipToCity;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public Customer getCustomerOwned() {
		return customerOwned;
	};

}
