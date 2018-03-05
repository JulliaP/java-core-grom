package lesson30.ITCompanies;

import java.util.ArrayList;

import java.util.Date;

public class Firm {
    private Date dateFounded;
    private ArrayList<Department> departments = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public Firm(Date dateFounded, ArrayList<Department> departments, ArrayList<Customer> customers) {
        this.dateFounded = dateFounded;
        this.departments = departments;
        this.customers = customers;
    }

    public Date getDateFounded() {
        return dateFounded;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setDateFounded(Date dateFounded) {
        this.dateFounded = dateFounded;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

}
