package lesson27.Homework;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        User user1 = new User(1001, "Pierre", "1w21212");
        User user2 = new User(1002, "Fadi", "1w21212");
        User user3 = new User(1003, "Patrik", "1w21212");
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        System.out.println(userRepository.getUsers());
        User user4 = new User(1003, "Julia", "1w21212");
        userRepository.update(user4);
        System.out.println(userRepository.getUsers());
        userRepository.delete(1003);
        System.out.println(userRepository.getUsers());
        /*
         * System.out.println(Arrays.deepToString(userRepository.getUsers())); userRepository.save(user);
         * System.out.println(Arrays.deepToString(userRepository.getUsers())); // soxranenie usera // soxranenie togo
         * zhe usera (novyj user s tem zhe id ne dolzhen byt' dobavlen) // kogda net mesta v massive // kogda soxranjaem
         * null int n = 15; while (n > 0) { User user1 = new User(n, "Ann", "1w21212");
         * System.out.println(userRepository.save(user1)); n--;
         * 
         * }
         * 
         * System.out.println(Arrays.deepToString(userRepository.getUsers()));
         * 
         * userRepository.save(null); System.out.println(Arrays.deepToString(userRepository.getUsers()));
         * 
         * // testiruem update/obnovlenie // kogda net usera na obnovlenie // kogda obnovljaem null
         * 
         * user = new User(5001, "Nikolaj", "awsff2323"); System.out.println(userRepository.update(user));
         * 
         * System.out.println(userRepository.update(null));
         */
    }

}
