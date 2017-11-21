package lesson20.task2;

public class TransactionDAO {
    // DAO - eto tozhe chto i repositorij, v DAO proisxodit rabota s dannymi
    private Transaction[] transactions = new Transaction[10];

    Transaction save(Transaction transaction) {
        // nuzhno nauchit'sja samim ponimat' chto tot ili inoj metod dolzhen vozvrashat' (i dolzhen li)
        // vse metody Save, kot my do six por pisali vozvrashajut tot object, kotoryj my soxranjaem. Pochemu?
        // Eto horoshaja praktika - vernut' soxranjaemyj object v metode Save(ne tolko tut no i na real'nyx proektax)
        // pochemu tak proisxodit? Potomu chto kogda object prihodit na soxranenie, kak pravilo u nego eshjo net Id,
        // object soxranjaetsja v BD i emu prisvaivaetsja id
        // dlja vypolnenija vsex ostal'nyx metodov, metod save vozvrashaet object uzhe s Id)
        // Metod Save dolzhen byt' dostupen dlja vsex - poetmu public, da i voobshe esli nichego ne skazano pro
        // ogranichenija k metodu, togda on public

        // Business-logic exceptions:
        // sum of tx > than limitSimpleTransactionAmount
        // Daily sum of tx > than limitTransactionsPerDayAmount
        // Count tx > than limitTransactionsPerDayCount
        // Gorod oplaty ne razreshen

        // Other exceptiona

        return null;
    }

    Transaction[] transactionList() {

        return null;
    }

    Transaction[] transactionList(String city) {

        return null;
    }

    Transaction[] transactionList(int amount) {

        return null;
    }
}
