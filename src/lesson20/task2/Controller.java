package lesson20.task2;

public class Controller {
    private TransactionDAO transactionDAO = new TransactionDAO();

    public Transaction save(Transaction transaction) throws Exception {

        return transactionDAO.save(transaction);
        // create response;
        // return response;

    }

    // zadacha Controllera - prinimat' zaprosy pol'zovatelja, raspredeljat' i vyzyvat' nuzhnuju chast' backenda
    // controller otvechaet za routing zaprosov na server, naprimer pol'zovatel' nazhimaet na ekrane knopku Istoriju tx
    // pervym delom zapros prihodit v kontroller, v etom klasse ishetsja podhodjashij metod, on vyzyvaetsja
    // chto proishodit v metode, controller ne interesuet, on peredaet otvetstvennost' dal'she ( v transactionDAO)
    // imenno poetomu metodu v transactionDAO i Controllere odinakovye
    // Korotko govorja - zadacha kontrollera - poisk nuzhnogo metoda

    Transaction[] transactionList() {
        return transactionDAO.transactionList();
    }

    Transaction[] transactionList(String city) {
        return transactionDAO.transactionList(city);
    }

    Transaction[] transactionList(int amount) {
        return transactionDAO.transactionList(amount);
    }
}
