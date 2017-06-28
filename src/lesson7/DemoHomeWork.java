package lesson7;

import java.util.Date;
import lesson6.Order;

public class DemoHomeWork {
	
	
	Order createOrder(){
		
		//Date now = new Date();
		Order orderObject1 = new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy" );
		

		return orderObject1;
	}
	
	
       Order createOrderAndCallMethods(){
		
		Order orderObject2 = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue" );
		
		orderObject2.confirmOrder();
		orderObject2.checkPrice();
		orderObject2.isValidType();
		
		return orderObject2;
	}
       
    //   public static void main(String[] args) {
    //	  new DemoHomeWork().createOrder();
     //  }

}
