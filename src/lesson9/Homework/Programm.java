package lesson9.Homework;

public class Programm {
	
	public static void main(String[] args) {
		User user = new User(1, "Ivan", "sw343");
		UserRepository repo = new UserRepository();
		repo.save(user);
		repo.update(user);
		

	}

}

