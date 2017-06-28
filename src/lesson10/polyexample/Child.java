package lesson10.polyexample;

public class Child extends Human {

	public Child(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		System.out.println("Child class is called...");
		super.run();
	}

}
