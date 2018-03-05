package lesson30.ITCompanies;

public class Customer {

    String name;
    String country;
    int monthlyPay;

    public Customer(String name, String country, int monthlyPay) {
        this.name = name;
        this.country = country;
        this.monthlyPay = monthlyPay;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getMonthlyPay() {
        return monthlyPay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMonthlyPay(int monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", country=" + country + ", monthlyPay=" + monthlyPay + "]";
    }

}
