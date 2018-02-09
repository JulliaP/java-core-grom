package lesson30.task1;

import lesson30.*;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        UkrainianBankSystem bankSystem = new UkrainianBankSystem();
        Bank euBank = new USBank(1222, "Sweden", Currency.EUR, 100, 133, 2, 2342342);
        User denis = new User(1001, "Denis", 12220, 40, "SEK", 1500, euBank);

        bankSystem.withdraw(denis, 150);
        Thread.sleep(3000);
        bankSystem.withdraw(denis, 20);
        Thread.sleep(3000);
        bankSystem.withdraw(denis, 20);
        System.out.println(bankSystem.getTransactions());
        System.out.println(denis);

    }
}
