package lesson10.Homework;

import java.util.Date;

public class FurnitureOrder extends Order {

	String furnitureCode;

	public FurnitureOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned,
			String furnitureCode) {
		super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
		this.furnitureCode = furnitureCode;
	}

	@Override
	public void validateOrder() {
		if (checkShipToCity() && checkCustomerCity() && checkGender() && checkBasePrice() && checkName()) {

			dateConfirmed = new Date();
		} else {

			dateConfirmed = null;
		}
	}

	boolean checkCustomerCity() {
		if (customerOwned.getCity() == "Киев" || customerOwned.getCity() == "Львов") {
			return true;
		} else {
			return false;
		}
}

	boolean checkShipToCity() {
		if (getShipToCity() != null) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkBasePrice() {
		if (basePrice >= 500) {
			return true;
		} else {
			return false;
		}

	}

	boolean checkGender() {
		if (customerOwned.getGender() == "Женский" || customerOwned.getGender() == "Мужской") {
			return true;
		} else {
			return false;
		}
	}

	boolean checkName() {
		if (customerOwned.getName() != "Тест") {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void calculatePrice() {
		if (basePrice < 5000) {
			totalPrice = basePrice + basePrice * 0.05;
		} else {
			totalPrice = basePrice + basePrice * 0.02;
		}

	}

}
