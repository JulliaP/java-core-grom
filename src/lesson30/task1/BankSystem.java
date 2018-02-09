package lesson30.task1;

public interface BankSystem {
    // AbstractClass Or Interface?
    // vopros: kak ponjat' nuzhen abstract class ili interface ?
    // otvet: esli net ni odnogo metoda s realizaciej, to est' vse metody abstract, togdda ispol'zovat' Interface.
    // I esli est' polja (!!!!) - togda eto abstract class, interface neset tol'ko povedenie

    void withdraw(User user, int amount);

    void fund(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
