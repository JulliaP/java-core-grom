package lesson6;

import java.util.Date;

public class Order {

	long id;
	int price;
	Date dateCreated;
	boolean isConfirmed;
	Date dateConfirmed;
	String city;
	String country;
	String type;

	public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country,
			String type) {
		this.price = price;
		this.dateCreated = dateCreated;
		this.isConfirmed = isConfirmed;
		this.dateConfirmed = dateConfirmed;
		this.city = city;
		this.country = country;
		this.type = type;
	}

	public Order() {

	}

	public void confirmOrder() {

		isConfirmed = true;
		dateConfirmed = new Date();

	}

	// return price > 1000;
	public boolean checkPrice() {
		if (price > 1000) {
			return true;
		} else
			return false;
	}

	// return type == "Buy" || type == "Sale";
	public boolean isValidType() {

		if (type == "Buy" || type == "Sale") {

			return true;
		} else
			return false;
	}

	public String toString() {
		return String.format("Order{%s, %s, %s, %s, %s, %s, %s}", price, dateCreated, isConfirmed, dateConfirmed, city,
				country, type);
	}
}
