package lesson20.task2;

import java.util.Calendar;
import java.util.Date;

public class Demo {

    public static void main(String[] args) throws Exception {

        Controller controller = new Controller();
        TransactionDAO transactionDAO = new TransactionDAO();
        Transaction transaction1 = new Transaction(12345, "Kiev", 20, "description", TransactionType.INCOME, new Date());
        Transaction transaction2 = new Transaction(12777, "Odessa", 1, "description", TransactionType.INCOME, new Date());
        Transaction transaction3 = new Transaction(12778, "Odessa", 1, "description", TransactionType.INCOME, new Date());
        Transaction transaction4 = new Transaction(12779, "Odessa", 2, "description", TransactionType.INCOME, new Date());
        Transaction transaction5 = new Transaction(12780, "Odessa", 3, "description", TransactionType.INCOME, new Date());
        Transaction transaction6 = new Transaction(12781, "Odessa", 4, "description", TransactionType.INCOME, new Date());
        Transaction transaction7 = new Transaction(12782, "Odessa", 3, "description", TransactionType.INCOME, new Date());
        Transaction transaction8 = new Transaction(12783, "Odessa", 6, "description", TransactionType.INCOME, new Date());
        Transaction transaction9 = new Transaction(12784, "Odessa", 7, "description", TransactionType.INCOME, new Date());
        Transaction transaction10 = new Transaction(12785, "Odessa", 8, "description", TransactionType.INCOME, new Date());
        Transaction transaction11 = new Transaction(12786, "Odessa", 3, "description", TransactionType.INCOME, new Date());
        // long id, String city, int amount, String description, TransactionType type, Date dateCreated

        controller.save(transaction1);
        controller.save(transaction2);
        controller.save(transaction3);
        controller.save(transaction4);
        controller.save(transaction5);
        controller.save(transaction6);
        controller.save(transaction7);
        controller.save(transaction8);
        // controller.save(transaction9);
        // controller.save(transaction10);
        // controller.save(transaction11);
        controller.transactionList("Odessa");
        controller.transactionList("Odessa");
        controller.transactionList();
    }

}
