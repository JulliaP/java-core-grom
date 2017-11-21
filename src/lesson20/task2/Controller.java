package lesson20.task2;

public class Controller {

    // zadacha Controllera - prinimat' zaprosy pol'zovatelja, raspredeljat' i vyzyvat' nuzhnuju chast' backenda
    // controller otvechaet za routing zaprosov na server, naprimer pol'zovatel' nazhimaet na ekrane knopku Istoriju tx
    // pervym delom zapros prihodit v kontroller, v etom klasse ishetsja podhodjashij metod, on vyzyvaetsja
    // chto proishodit v metode, controller ne interesuet, on peredaet otvetstvennost' dal'she ( v transactionDAO)
    // imenno poetomu metodu v transactionDAO i Controllere odinakovye

    public Transaction save(Transaction transaction) {
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
