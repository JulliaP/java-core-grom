package lesson12;

public class Main {

    public static void main(String[] args) {

        Bank usBank = new USBank(1222, "US", Currency.USD, 100, 1400, 4, 433343);
        Bank euBank = new EUBank(1234, "Sweden", Currency.EUR, 1000, 1400, 4, 433343);
        Bank chinaBank = new ChinaBank(1235, "Germany", Currency.EUR, 1378, 1400, 4, 433343);

        // long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long
        // rating, long totalCapital
        User user1 = new User(1001, "Denis", 12200, 40, "GMD", 1500, usBank);
        User user2 = new User(1021, "Julia", 32000, 40, "DigitalRiver", 3000, usBank);
        User user3 = new User(1051, "Linda", 25000, 360, "DigitalRiver", 2500, euBank);
        User user4 = new User(1081, "Don Karlos", 125000, 360, "HP", 2500, euBank);
        User user5 = new User(1091, "Ling", 225000, 360, "HP", 2500, chinaBank);
        User user6 = new User(2031, "Tengjao", 465000, 360, "HP", 2500, chinaBank);

        // (long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank)

        BankSystem bankSystem = new UkrainianBankSystem();

        bankSystem.withdraw(user1, 150);
        bankSystem.fund(user1, 1001);
        bankSystem.transferMoney(user1, user3, 200);
        bankSystem.paySalary(user1);
        System.out.println(user1.getBalance() + " is balance for user " + user1.getName());

        bankSystem.withdraw(user2, 150);
        bankSystem.fund(user2, 1001);
        bankSystem.transferMoney(user2, user1, 200);
        bankSystem.paySalary(user2);
        System.out.println(user2.getBalance() + " is balance for user " + user2.getName());

        bankSystem.withdraw(user3, 150);
        bankSystem.fund(user3, 1001);
        bankSystem.transferMoney(user3, user4, 200);
        bankSystem.paySalary(user3);
        System.out.println(user3.getBalance() + " is balance for user " + user3.getName());

        bankSystem.withdraw(user4, 150);
        bankSystem.fund(user4, 1001);
        bankSystem.transferMoney(user4, user3, 200);
        bankSystem.paySalary(user4);
        System.out.println(user4.getBalance() + " is balance for user " + user4.getName());

        bankSystem.withdraw(user5, 150);
        bankSystem.fund(user5, 1001);
        bankSystem.transferMoney(user5, user6, 200);
        bankSystem.paySalary(user5);
        System.out.println(user5.getBalance() + " is balance for user " + user5.getName());

        bankSystem.withdraw(user6, 150);
        bankSystem.fund(user6, 1001);
        bankSystem.transferMoney(user6, user5, 200);
        bankSystem.paySalary(user6);
        System.out.println(user6.getBalance() + " is balance for user " + user6.getName());

    }

}
