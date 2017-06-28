package lesson10.Homework;

import java.util.Date;

public class ElectronicsOrder extends Order {

	int guaranteeMonths;

	public ElectronicsOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned,
			int guaranteeMonths) {
		super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
		this.guaranteeMonths = guaranteeMonths;
	}

	@Override
	public void validateOrder() {

		if (checkShipToCity() && checkCustomerCity() && checkGender() && checkBasePrice() && checkName()) {

			dateConfirmed = new Date();
		} else {

			dateConfirmed = null;
		}
	}

	boolean checkShipToCity() {
		String shipToCity = getShipToCity();

		return (shipToCity == "Харьков" || shipToCity == "Киев" || shipToCity == "Одесса" || shipToCity == "Днепр");

	}

	boolean checkCustomerCity() {
		String customerCity = customerOwned.getCity();

		return (customerCity == "Харьков" || customerCity == "Киев" || customerCity == "Одесса"
				|| customerCity == "Днепр");
	}

	boolean checkGender() {

		return (customerOwned.getGender() == "Женский");
	}

	boolean checkBasePrice() {

		return (basePrice > 100);
	}

	boolean checkName() {

		return customerOwned.getName() != null;
	}

	@Override
	public void calculatePrice() {

		if (getShipToCity() == "Киев" || getShipToCity() == "Одесса") {
			totalPrice = (basePrice + basePrice * 0.10);
		} else {
			totalPrice = (basePrice + basePrice * 0.15);
		}

		if (totalPrice > 1000) {

			totalPrice -= totalPrice * 0.05;
		}
	}

}
