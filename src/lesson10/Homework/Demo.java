package lesson10.Homework;

public class Demo {

	public static void main(String[] args) {

		ElectronicsOrder elorder1 = new ElectronicsOrder("Таймер", null, "Киев", 24, null, 55);
		elorder1.validateOrder();
		elorder1.calculatePrice();
		elorder1.confirmShipping();

		ElectronicsOrder elorder2 = new ElectronicsOrder("Calculator", null, "Харьков", 24, null, 55);
		elorder2.validateOrder();
		elorder2.calculatePrice();
		elorder2.confirmShipping();

		FurnitureOrder furniture1 = new FurnitureOrder("кресло", null, "Одесса", 25, null, "IEE345");
		furniture1.validateOrder();
		furniture1.calculatePrice();
		furniture1.confirmShipping();

		FurnitureOrder furniture2 = new FurnitureOrder("диван", null, "Киев", 25, null, "IEE346");
		furniture2.validateOrder();
		furniture2.calculatePrice();
		furniture2.confirmShipping();

	}

}
