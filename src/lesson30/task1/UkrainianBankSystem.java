package lesson30.task1;

import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// V etom klasse horoshij primer incapsulation. My vydelili System.err.println v otdel'nyj private method. V chem smysl? 

//V tom,  chto esli teskst soobshenija v budushem pridetsja zamenit', a takix mest s soobshenijami u nas 20 shtuk, 
//nam dostatochno budet zamenit' tekst vsego lish odin raz. Sam method withdrow on publlic, nash dobavlennyj method 
//printWithdrawalErrorMsg on private. Takim obrazom my skryvaem detali realizacii ot drugix developers. 

// vse private methods opuskajutsja vniz koda, vse public vverhu.

public class UkrainianBankSystem implements BankSystem {

    // vse tx dobavlennye v etot TreeSet po umolchaniju budut otsortirovany på ubyvaniju po date. Ostajetsja dobavit'
    // chast' koda kotoraja budet dobavljat tx v etot samyj set.
    // Dobavljaem v kazhdyj metod.
    private Set<Transaction> transactions = new TreeSet<>();

    @Override
    public void withdraw(User user, int amount) {
        // proverit' 1) Ne prevyshaet li amount dopustimyj limitOf Withdrawal ?
        // 2. Dostatochno li deneg na schetu,
        // 3. Esli oba uslovija ok - snjat'

        /*
         * int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
         * 
         * if (amount + user.getBank().getCommission(amount) > limitOfWithdrawal) {
         * printWithdrawalErrorMsg(amount,user); return; }
         * 
         * if (amount + user.getBank().getCommission(amount) > user.getBalance()) {
         * printWithdrawalErrorMsg(amount,user); return; }
         */

        if (!checkWithdraw(user, amount)) {
            return;
        }

        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));

        createAndSaveTransaction(new Date(), TransactionType.WITHDRAWAL, amount, "somedesc");
    }

    @Override
    public void fund(User user, int amount) {
        // 1. Proverit' ne prevyshen li limit of funding (bez ucheta kommissii)

        if (!checkFund(user, amount)) {
            return;
        }
        // TODO Auto-generated method stub
        user.setBalance(user.getBalance() + amount);
        createAndSaveTransaction(new Date(), TransactionType.FUNDING, amount, "somedesc");
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        // Snimaen den'gi s odnogo usera(fromUser)
        // popolnjaem schet drugogo toUser

        // 1. Proverit' chto my mozhem delat' withdrawal v banke odnogo usera
        if (!checkWithdraw(fromUser, amount)) {
            return;
        }
        if (!checkFund(toUser, amount)) {
            return;
        }
        if (!checkCurrency(fromUser, toUser)) {
            return;
        }
        // 2. Proverit' chto my mozhem delat' funds v banke drugogo usera (toUser)
        // 3. Proapdejtit' novyj balance
        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount);
        // ToDo withdraw and fund

        createAndSaveTransaction(new Date(), TransactionType.TRANSFER, amount, "somedesc");
    }

    @Override
    public void paySalary(User user) {

        if (!checkFund(user, user.getSalary())) {
            return;
        }
        user.setBalance(user.getBalance() + user.getSalary());

        int amount = user.getSalary();
        createAndSaveTransaction(new Date(), TransactionType.FUNDING, amount, "somedesc");
    }

    private boolean checkWithdraw(User user, int amount) {
        /*
         * Just example about how to replace if with return boolean isRead() { // if (dateRead == null) // return false;
         * // return true;
         * 
         * return dateRead == null; }
         */

        return (checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&

                checkWithdrawLimits(user, amount, user.getBalance())); // kogda oba true
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit) {
        if (amount + amount * user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private boolean checkFund(User user, int amount) {

        return (checkFundingLimits(user, amount, user.getBank().getLimitOfFunding()));

    }

    private boolean checkFundingLimits(User user, int amount, double limit) {
        if (amount + amount * user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private boolean checkCurrency(User fromUser, User toUser) {
        if (fromUser.getBank().getCurrency() != toUser.getBank().getCurrency()) {

            printTransferErrorMsg(fromUser, toUser);
            return false;
        }
        return true;
    }

    private void printWithdrawalErrorMsg(int amount, User user) {
        System.err.println("Operation can not be executed " + amount + " for user " + user.getName());
    }

    private void printTransferErrorMsg(User fromUser, User toUser) {
        System.err.println("Transfer from user " + fromUser.getName() + " to user " + toUser.getName() + " is not permitted");
    }

    private Transaction createAndSaveTransaction(Date dateCreated, TransactionType type, int amount, String descr) {

        Random random = new Random();
        Transaction tr = new Transaction(random.nextInt(), dateCreated, null, type, amount, descr);
        // long id, Date dateCreated, Date dateConfirmed, TransactionType type, int amount, String description
        transactions.add(tr);
        return tr;

    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

}
