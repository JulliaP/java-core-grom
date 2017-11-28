package lesson22.Homework;

public class Controller {

    // private TransactionDAO transactionDAO = new TransactionDAO();

    public static Transaction save(Transaction transaction) throws Exception {

        return TransactionDAO.save(transaction);
        // create response;
        // return response;

    }

    // zadacha Controllera - prinimat' zaprosy pol'zovatelja, raspredeljat' i vyzyvat' nuzhnuju chast' backenda
    // controller otvechaet za routing zaprosov na server, naprimer pol'zovatel' nazhimaet na ekrane knopku Istoriju tx
    // pervym delom zapros prihodit v kontroller, v etom klasse ishetsja podhodjashij metod, on vyzyvaetsja
    // chto proishodit v metode, controller ne interesuet, on peredaet otvetstvennost' dal'she ( v transactionDAO)
    // imenno poetomu metodu v transactionDAO i Controllere odinakovye
    // Korotko govorja - zadacha kontrollera - poisk nuzhnogo metoda

    public static Transaction[] transactionList() {
        return TransactionDAO.transactionList();
    }

    public static Transaction[] transactionList(String city) {
        return TransactionDAO.transactionList(city);
    }

    public static Transaction[] transactionList(int amount) {
        return TransactionDAO.transactionList(amount);
    }
}
