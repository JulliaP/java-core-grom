package lesson8.phones;

public class Demo {
  	
	public static void main(String[] args){
		
		Iphone iphone = new Iphone(110, 10.0, "China", true);
		
		iphone.deleteIphoneFromDb();
		iphone.orderPhone();
		
		
		
	}
}
