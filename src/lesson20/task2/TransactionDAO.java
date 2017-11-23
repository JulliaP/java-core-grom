package lesson20.task2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class TransactionDAO {
    // DAO - eto tozhe chto i repositorij, v DAO proisxodit rabota s dannymi
    private Transaction[] transactions = new Transaction[10];
    private Utils utils = new Utils();

    public Transaction save(Transaction transaction) throws Exception {
        // nuzhno nauchit'sja samim ponimat' chto tot ili inoj metod dolzhen vozvrashat' (i dolzhen li)
        // vse metody Save, kot my do six por pisali vozvrashajut tot object, kotoryj my soxranjaem. Pochemu?
        // Eto horoshaja praktika - vernut' soxranjaemyj object v metode Save(ne tolko tut no i na real'nyx proektax)
        // pochemu tak proisxodit? Potomu chto kogda object prihodit na soxranenie, kak pravilo u nego eshjo net Id,
        // object soxranjaetsja v BD i emu prisvaivaetsja id. Vot etot ob'jekt, uzhe s id, horosho by i vernut'na vyhode
        // dlja vypolnenija vsex ostal'nyx metodov, metod save vozvrashaet object uzhe s Id)
        // Metod Save dolzhen byt' dostupen dlja vsex - poetmu public, da i voobshe esli nichego ne skazano pro
        // ogranichenija k metodu, togda on public

        // Business-logic exceptions:
        // sum of tx > than limitSimpleTransactionAmount +
        // Daily sum of tx > than limitTransactionsPerDayAmount+
        // Count tx > than limitTransactionsPerDayCount +
        // Gorod oplaty ne razreshen -DZ (BadRequestException)

        // Other exceptions
        // ne xvatilo mesta -DZ (vybrasyvaem oshibku InternalServerException)

        validate(transaction);
        int index = 0;
        for (Transaction tr : transactions) {
            if (tr == null) {
                transactions[index] = transaction;
                return transaction;
            }
            index++;
        }

        throw new InternalServerException("No empty slot for txID " + transaction.getId() + " .Can't be saved ");

    }

    public Transaction[] transactionList() {
        System.out.println(Arrays.toString(transactions) + "list of all tx");
        return transactions;
    }

    public Transaction[] transactionList(String city) {
        int count = 0;

        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getCity().equals(city)) {
                count++;
                continue;
            }
        }

        Transaction[] result = new Transaction[count];

        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getCity().equals(city)) {
                result[index] = transaction;
                index++;
            }
        }
        System.out.println(Arrays.toString(result) + "find" + count + "tx for this city");
        return result;
    }

    public Transaction[] transactionList(int amount) {
        int count = 0;

        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getAmount() == amount) {
                count++;
                continue;
            }
        }

        Transaction[] result = new Transaction[count];

        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getAmount() == amount) {
                result[index] = transaction;
                index++;
            }
        }
        System.out.println(Arrays.toString(result) + "find" + count + "tx with this amount");
        return result;
    }

    private void validate(Transaction transaction) throws Exception {
        // pervaja validacija LimitSimpleTransactionAmount
        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount()) {
            throw new LimitExceeded("Transaction limit exceeded " + transaction.getId() + ". Can't be saved");
        }

        // vtoraja validacija LimitTransactionsPerDayAmoun
        int sum = 0;
        int count = 0;

        for (Transaction tr : getTransactionPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }

        if (sum + transaction.getAmount() > utils.getLimitTransactionsPerDayAmount()) {
            throw new LimitExceeded("Transaction limit per day amount exceeded " + transaction.getId() + ".Can't be saved");
        }
        // tretja validacija LimitTransactionsPerDayCount
        if (count + 1 > utils.getLimitTransactionsPerDayCount()) {
            throw new LimitExceeded("Transaction limit per day count exceeded " + transaction.getId() + ".Can't be saved");
        }
        // chetvertaja validacija Gorod
        boolean validCity = false;

        for (String c : utils.getCities()) {
            if (c != null && c.equals(transaction.getCity())) {
                validCity = true;
                break;
            }
        }

        if (!validCity) {

            throw new BadRequestException("We don't work with City :  " + transaction.getCity() + ". Cant' be save");
        }
        // TO DO - Gorod oplaty ne razreshen -DZ (BadRequestException), ne xvatilo mesta -DZ (vybrasyvaem oshibku
        // InternalServerException)

        // 5th validation - no empty slot
    }

    private Transaction[] getTransactionPerDay(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);

        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;

        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day) {
                    count++;
                }
            }
        }

        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day) {
                    result[index] = transaction;
                    index++;
                }
            }
        }

        return result;
    }
}
