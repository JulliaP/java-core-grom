package lesson9.Homework;

public class UserRepository {

	private User[] users = new User[10];

	public User save(User user) {

		// check if user is in the users array
		/*
		 * for (User u: users) { if (u != null) { if (u.getId() == user.getId())
		 * { return null; } } }
		 */

		User maybyUser = findById(user.getId());
		if (maybyUser != null) {
			return null;
		}

		// find free (null) slot in users and save user in array
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				users[i] = user;
				return user;
			}
		}

		// no free slots
		return null;
	}

	public User update(User user) {
		User userToUpdate = findById(user.getId());

		if (userToUpdate == null) {
			return null;
		}

		for (int i = 0; i < users.length; i++) {
			// User user = users[i];
			if ((users[i] != null) && (users[i].getId() == user.getId())) {
				users[i] = user;
			}
		}
		// userToUpdate.setName(user.getName());
		// userToUpdate.setSessionId(user.getSessionId());

		return user;
	}

	public void delete(long id) {
		for (int i = 0; i < users.length; i++) {
			if ((users[i] != null) && (users[i].getId() == id)) {
				users[i] = null;
			}
		}
	}

	private User findById(long id) {
		for (int i = 0; i < users.length; i++) {
			User user = users[i];
			if ((user != null) && (user.getId() == id)) {
				return user;
			} 
		}
		return null;
	}
}
