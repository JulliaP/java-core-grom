package lesson13;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        User user = new User(1001, "Ann", "1w21212");
        // User user2 = new User(1002, "Ann0", "1w21212A");
        userRepository.save(user);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        // soxranenie usera
        // soxranenie togo zhe usera (novyj user s tem zhe id ne dolzhen byt' dobavlen)
        // kogda net mesta v massive
        // kogda soxranjaem null
        int n = 15;
        while (n > 0) {
            User user1 = new User(n, "Ann", "1w21212");
            System.out.println(userRepository.save(user1));
            n--;

        }

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(null);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        // testiruem update/obnovlenie
        // kogda net usera na obnovlenie
        // kogda obnovljaem null

        user = new User(5001, "Nikolaj", "awsff2323");
        System.out.println(userRepository.update(user));

        System.out.println(userRepository.update(null));
        // System.out.println(Arrays.deepToString(userRepository.getUsers()));

    }

}
