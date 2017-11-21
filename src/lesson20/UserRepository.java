package lesson20;

public class UserRepository {

    private User[] users = new User[10];

    public User save(User user) throws Exception {

        if (user == null) {
            throw new BadRequestException("Can't save null user");
        }

        // check if user is in the users array already

        try {
            findById(user.getId());
            throw new BadRequestException("User with id " + user.getId() + "already exists");
        } catch (UserNotFoundException e) {
            System.out.println("User with id " + user.getId() + " not found. Will be saved");
        }

        // find free (null) slot in users and save user in array
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return users[i]; // zapomnit' - posle return v metode nichego ne vypolnjaetsja
            }
        }

        // no free slots

        throw new InternalServerException("not enough space to save user with id " + user.getId());

    }

    public User update(User user) throws Exception {

        if (user == null) {
            throw new BadRequestException("Can't update null user");
        }

        for (int i = 0; i < users.length; i++) {
            // User user = users[i];
            if ((users[i] != null) && (users[i].getId() == user.getId())) {
                users[i] = user;
                return users[i];
            }
        }
        // userToUpdate.setName(user.getName());
        // userToUpdate.setSessionId(user.getSessionId());

        throw new InternalServerException("Unexpected error");
    }

    public void delete(long id) throws Exception {
        findById(id);

        for (int i = 0; i < users.length; i++) {
            if ((users[i].getId() == id)) {
                users[i] = null;
                break;
            }
        }
    }

    public User findById(long id) throws Exception {
        for (User user : users) {
            if ((user != null) && (user.getId() == id)) {
                return user;
            }
        }

        throw new UserNotFoundException("User with id" + "not found");

    }
}
