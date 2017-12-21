package lesson27.Homework;

import java.util.ArrayList;

//import java.util.Iterator;
import java.util.List;

public class UserRepository {

    List<User> userList = new ArrayList<>();

    public User save(User user) {

        if (user == null) {
            return null;
        }
        User maybyUser = findById(user.getId());
        if (maybyUser != null) {
            return null;
        }

        userList.add(user);
        return user;

    }

    public User update(User user) {

        if (user == null) {
            return null;
        }
        User userToUpdate = findById(user.getId());

        if (userToUpdate == null) {
            return null;
        }

        userList.remove(userToUpdate);
        userList.add(user);

        return user;
    }

    public void delete(long id) {

        /*
         * Iterator<User> it = userList.iterator(); while (it.hasNext()) { if (it.next().getId() == id) { it.remove(); }
         * }
         */
        for (User user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
            }

        }
    }

    private User findById(long id) {
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return userList;
    }

}
