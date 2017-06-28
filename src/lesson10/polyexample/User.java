package lesson10.polyexample;

public class User extends Human {

	public User(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		System.out.println("User class is called...");
		super.run();
	}

}
