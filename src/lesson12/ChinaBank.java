package lesson12;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getLimitOfWithdrawal() {
        // USD - 1000, EUR -1200

        if (getCurrency() == Currency.USD) {

            return 100;
        }
        return 150;
    }

    @Override
    public int getLimitOfFunding() {
        // TODO Auto-generated method stub
        if (getCurrency() == Currency.EUR) {
            return 5000;
        }
        return 10000;

    }

    @Override
    public double getMonthlyRate() {
        // 1 % USD, 2 % EUR
        if (getCurrency() == Currency.EUR) {
            return 0.00;
        }

        return 0.01;

    }

    @Override
    public double getCommission(int amount) {
        // USD and Up to 1000 then 5%,
        // USD and > 1000 then 7%,
        // EUR and up to 1000 then 6%,
        // EUR and > 1000 then 8%,
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) {
                return 0.03;
            } else {
                return 0.05;
            }

        } else {
            if (amount <= 1000) {
                return 0.10;
            } else {
                return 0.11;
            }
        }

    }

}
