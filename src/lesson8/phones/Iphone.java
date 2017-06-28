package lesson8.phones;

public class Iphone extends Phone{
		
	boolean fingerPrint;

	public Iphone(int price, double weight, String countryProduced, boolean fingerPrint) {
		super (price, weight, countryProduced);
		System.out.println("IPhone constructor was invoked...");
		this.fingerPrint = fingerPrint;
	}
	
		
	void deleteIphoneFromDb(){
		System.out.println("deleteIhponeFromDb invoiked...");
	}
}
