package lesson10.Homework;

import java.util.Date;

public class ElectronicsOrder1 extends Order {

	int guaranteeMonths;

	// ElectronicsOrder.<init>(ElectronicsOrder this, String itemName, Date
	// dateCreated, String shipToCity, int basePrice, Customer customerOwned)
	public ElectronicsOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned,
			int guaranteeMonths) {
		// ((Order) super).<init>(this, itemName, dateCreated, shipToCity,
		// basePrice, customerOwned);

		super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
		this.guaranteeMonths = guaranteeMonths;
	}

	@Override
	public void validateOrder() {
	
		if (checkShipToCity() && checkCustomerCity() && checkGender() && checkBasePrice() && checkCustomerName()){
			
			dateConfirmed = new Date();
		}else {

			dateConfirmed = null;
		}
			
		
		 boolean checkShipToCity(){
				if (getShipToCity() == "Харьков" || getShipToCity() == "Киев" || getShipToCity() == "Одесса"
						|| getShipToCity() == "Днепр"){
					
					return true;
				} else{
					return false;
				}
						}	
				
			
						
		
		boolean checkCustomerCity(){
			if (customerOwned.getCity() == "Kharkiv" || customerOwned.getCity() == "Kiev"
					|| customerOwned.getCity() == "Odessa" || customerOwned.getCity() == "Dnepr"){
				return true;
						}
			return false;
		}
		
		
		if ((getShipToCity() == "Kharkiv" || getShipToCity() == "Kiev" || getShipToCity() == "Odessa"
				|| getShipToCity() == "Dnepr")
				&& (customerOwned.getCity() == "Kharkiv" || customerOwned.getCity() == "Kiev"
						|| customerOwned.getCity() == "Odessa" || customerOwned.getCity() == "Dnepr")
				&& (customerOwned.getGender() == "Female") && basePrice > 100 && customerOwned.getName() != null) {

			dateConfirmed = new Date();

		} else {

			dateConfirmed = null;
		}

	}

	@Override
	public void calculatePrice() {

		if (getShipToCity() == "Kiev" || getShipToCity() == "Odessa") {
			totalPrice = (basePrice + basePrice * 0.10);
		} else {
			totalPrice = (basePrice + basePrice * 0.15);
		}

		if (totalPrice > 1000) {

			totalPrice -= totalPrice * 0.05;
		}
	}

}
